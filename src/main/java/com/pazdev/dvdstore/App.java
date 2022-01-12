package com.pazdev.dvdstore;

import com.pazdev.dvdstore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(App.class, args);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
