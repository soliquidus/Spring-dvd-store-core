package com.pazdev.dvdstore.service;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.repository.MovieRepositoryInterface;


public class MovieService implements MovieServiceInterface {
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }
}
