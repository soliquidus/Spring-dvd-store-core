package com.pazdev.dvdstore.service;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.repository.MovieRepository;


public class MovieService {
    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
