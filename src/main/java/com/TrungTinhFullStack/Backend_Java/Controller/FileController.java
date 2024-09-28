package com.TrungTinhFullStack.Backend_Java.Controller;

import com.TrungTinhFullStack.Backend_Java.Service.File.FileService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @Value("${project.poster}")
    private String path;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFileHandel(@RequestPart MultipartFile file) throws IOException {
        String uploadedFileName = fileService.uploadFile(path,file);
        return ResponseEntity.ok("File uploaded : " + uploadedFileName);
    }

    @GetMapping("/{fileName}")
    public void getFileNameHandel(@PathVariable String fileName,HttpServletResponse response) throws IOException {
        InputStream resourceFile = fileService.getResourceFile(path,fileName);
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(resourceFile,response.getOutputStream());
    }
}
