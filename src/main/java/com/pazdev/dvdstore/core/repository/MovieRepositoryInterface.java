package com.pazdev.dvdstore.core.repository;

import com.pazdev.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void addMovie(Movie movie);
    List<Movie> list();
    Movie getById(long id);
}
