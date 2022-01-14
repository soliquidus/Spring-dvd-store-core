package com.pazdev.dvdstore.core.service;

import com.pazdev.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    List<Movie> getMovieList();
    Movie getMovieById(long id);
}
