package com.pazdev.dvdstore.repository;

import com.pazdev.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void addMovie(Movie movie);
    List<Movie> list();
}
