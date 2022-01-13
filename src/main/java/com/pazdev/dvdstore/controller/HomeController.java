package com.pazdev.dvdstore.controller;

import com.pazdev.dvdstore.entity.Movie;
import com.pazdev.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    public HomeController(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public MovieServiceInterface getMovieServiceInterface() {
        return movieService;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome() {
        return movieService.getMovieList();
    }
}
