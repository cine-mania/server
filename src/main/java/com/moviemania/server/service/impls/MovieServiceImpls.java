package com.moviemania.server.service.impls;

import com.moviemania.server.model.Movie;
import com.moviemania.server.payload.MovieDto;
import com.moviemania.server.repository.MovieRepository;
import com.moviemania.server.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpls implements MovieService {

   private  MovieRepository movieRepository ;

    public MovieServiceImpls(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieDto addMovie(MovieDto movieDto) {
       Movie movie=mapToEntity(movieDto);
       Movie newMovie= movieRepository.save(movie);
        return mapToDto(newMovie);
    }

    @Override
    public void deleteMovie(long id) {
        try {
            movieRepository.deleteById(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ;

    }

    private MovieDto mapToDto(Movie movie)
    {
        MovieDto movieDto=new MovieDto();
        movieDto.setMovieId(movie.getMovieId());
        movieDto.setMovieName(movie.getMovieName());
        movieDto.setMovieGenre(movie.getMovieGenre());
        movieDto.setMovieDirector(movie.getMovieDirector());
        movieDto.setMovieLength(movie.getMovieLength());
        movieDto.setMovieReleaseDate(movie.getMovieReleaseDate());
        movieDto.setLanguage(movie.getLanguage());

        return movieDto;
    }
    private Movie mapToEntity(MovieDto movieDto)
    {
        Movie movie=new Movie();
        movie.setMovieName(movieDto.getMovieName());
        movie.setMovieId(movieDto.getMovieId());
        movie.setMovieGenre(movieDto.getMovieGenre());
        movie.setMovieDirector(movieDto.getMovieDirector());
        movie.setMovieLength(movieDto.getMovieLength());
        movie.setMovieReleaseDate(movieDto.getMovieReleaseDate());
        movie.setLanguage(movieDto.getLanguage());
        return movie;

    }

}
