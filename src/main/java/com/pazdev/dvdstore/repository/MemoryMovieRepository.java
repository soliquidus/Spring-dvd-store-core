package com.pazdev.dvdstore.repository;

import com.pazdev.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface{
    private static List<Movie> movies = new ArrayList<>();


    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
