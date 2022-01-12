package com.pazdev.dvdstore.repository.memory;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
    private static List<Movie> movies = new ArrayList<>();


    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
