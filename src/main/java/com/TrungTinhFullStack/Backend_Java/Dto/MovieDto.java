package com.TrungTinhFullStack.Backend_Java.Dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Long id;

    @NotBlank(message = "Please provide movie is title !")
    private String title;

    @NotBlank(message = "Please provide movie is director !")
    private String director;

    @NotBlank(message = "Please provide movie is studio !")
    private String studio;

    private List<String> movieCast;

    @NotBlank(message = "Please provide movie is release year !")
    private Integer releaseYear;

    @NotBlank(message = "Please provide movie is poster !")
    private String poster;

    @NotBlank(message = "Please provide poster is Url !")
    private String posterUrl;
}
