package com.TrungTinhFullStack.Backend_Java.Service.Movie;

import com.TrungTinhFullStack.Backend_Java.Dto.MovieDto;
import com.TrungTinhFullStack.Backend_Java.Entity.Movie;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MovieService {

    Movie addMovie(MovieDto movieDto, MultipartFile file);
    MovieDto getMovieById(Long id);
    List<MovieDto> getAllMovie();
}
