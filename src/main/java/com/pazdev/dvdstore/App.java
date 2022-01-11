package com.pazdev.dvdstore;

import com.pazdev.dvdstore.controller.MovieController;

public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}
