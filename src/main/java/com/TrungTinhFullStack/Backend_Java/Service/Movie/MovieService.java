package com.TrungTinhFullStack.Backend_Java.Service.Movie;

import com.TrungTinhFullStack.Backend_Java.Dto.MovieDto;
import com.TrungTinhFullStack.Backend_Java.Entity.Movie;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MovieService {

    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;
    MovieDto getMovieById(Long id);
    List<MovieDto> getAllMovie();
    MovieDto updateMovie(Long id,MovieDto movieDto,MultipartFile file) throws IOException;
    String deleteMovie(Long id) throws IOException;
}
