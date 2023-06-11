package com.moviemania.server.controller;

import com.moviemania.server.payload.MovieDto;
import com.moviemania.server.payload.TheatreDto;
import com.moviemania.server.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie")

public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/register")
    public ResponseEntity<MovieDto> registerTheatreController(@RequestBody MovieDto movieDto) {

        MovieDto newMovie=movieService.addMovie(movieDto);
        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
    }

}
