package com.pazdev.dvdstore.core.service;

import com.pazdev.dvdstore.core.entity.Movie;
import com.pazdev.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.list();
    }

    @Override
    public Movie getMovieById(long id) {
        return movieRepository.getById(id);
    }
}
