package com.TrungTinhFullStack.Backend_Java.Controller;

import com.TrungTinhFullStack.Backend_Java.Dto.MovieDto;
import com.TrungTinhFullStack.Backend_Java.Service.Movie.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<MovieDto> addMovieHandel(@RequestPart MultipartFile file,
                                                   @RequestPart String movieDto) throws IOException {
        MovieDto movieDto1 = convertToMovieDto(movieDto);
        return new ResponseEntity<>(movieService.addMovie(movieDto1,file), HttpStatus.CREATED);

    }

    private MovieDto convertToMovieDto(String movieDtoObj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(movieDtoObj,MovieDto.class);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<MovieDto>> getAllMovieHandel() {
        return ResponseEntity.ok(movieService.getAllMovie());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MovieDto> updateMovieHandel(@PathVariable Long id,
                                                      @RequestPart MultipartFile file,
                                                      @RequestPart String movieDtoObj) throws IOException {
        if(file.isEmpty()) {
            file = null;
        }
        MovieDto movieDto = convertToMovieDto(movieDtoObj);
        return ResponseEntity.ok(movieService.updateMovie(id,movieDto,file));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMovieHandel(@PathVariable Long id) throws IOException {
        return ResponseEntity.ok(movieService.deleteMovie(id));
    }
}
