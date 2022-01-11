package com.pazdev.dvdstore.controller;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private final MovieService movieService = new MovieService();

    public void addUsingConsole(){
        System.out.println( "What is the movie title?" );
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        System.out.println( "What is the movie genre?" );
        String genre=scanner.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
