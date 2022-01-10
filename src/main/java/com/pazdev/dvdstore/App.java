package com.pazdev.dvdstore;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.service.MovieService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Add a new movie:" );
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieName);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
