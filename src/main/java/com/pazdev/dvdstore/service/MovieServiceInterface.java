package com.pazdev.dvdstore.service;

import com.pazdev.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();
}
