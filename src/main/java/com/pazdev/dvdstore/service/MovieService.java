package com.pazdev.dvdstore.service;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.repository.GoLiveMovieRepository;


public class MovieService {
    private final GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
