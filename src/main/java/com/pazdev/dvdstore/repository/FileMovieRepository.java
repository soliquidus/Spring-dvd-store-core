package com.pazdev.dvdstore.repository;

import com.pazdev.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileMovieRepository implements MovieRepositoryInterface {

    private File file;

    public void addMovie(Movie movie) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
