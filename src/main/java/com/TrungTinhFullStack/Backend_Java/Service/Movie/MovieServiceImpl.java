package com.TrungTinhFullStack.Backend_Java.Service.Movie;

import com.TrungTinhFullStack.Backend_Java.Dto.MovieDto;
import com.TrungTinhFullStack.Backend_Java.Entity.Movie;
import com.TrungTinhFullStack.Backend_Java.Repository.MovieRepository;
import com.TrungTinhFullStack.Backend_Java.Service.File.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private FileService fileService;

    @Value("${project.poster}")
    private String path;

    @Override
    public Movie addMovie(MovieDto movieDto, MultipartFile file) {

        return null;
    }

    @Override
    public MovieDto getMovieById(Long id) {
        return null;
    }

    @Override
    public List<MovieDto> getAllMovie() {
        return null;
    }
}
