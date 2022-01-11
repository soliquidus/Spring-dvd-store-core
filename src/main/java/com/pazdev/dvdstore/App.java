package com.pazdev.dvdstore;

import com.pazdev.dvdstore.controller.MovieController;
import com.pazdev.dvdstore.repository.GoLiveMovieRepository;
import com.pazdev.dvdstore.service.MovieService;

public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
