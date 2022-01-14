package com.pazdev.dvdstore.core.repository.memory;

import com.pazdev.dvdstore.core.entity.Movie;
import com.pazdev.dvdstore.core.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    public static long lastId = 0L;

    private static final List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movie.setId(lastId++);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
