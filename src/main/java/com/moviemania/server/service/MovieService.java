package com.moviemania.server.service;

import com.moviemania.server.payload.MovieDto;

public interface MovieService {
    MovieDto addMovie(MovieDto movieDto);
    void deleteMovie(long id);
}
