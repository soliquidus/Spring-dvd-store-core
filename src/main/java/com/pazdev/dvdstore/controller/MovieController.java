package com.pazdev.dvdstore.controller;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.service.DefaultMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    @Autowired
    private DefaultMovieService movieService = new DefaultMovieService();

    public DefaultMovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(DefaultMovieService movieService) {
        this.movieService = movieService;
    }

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
