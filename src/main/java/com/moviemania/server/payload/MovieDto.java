package com.moviemania.server.payload;

import com.moviemania.server.model.Show;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class MovieDto {
    private long movieId;
    private String movieName;

    private String movieGenre;

    private String movieDirector;

    private int movieLength;
    private   String language;

    private String movieReleaseDate;
}
