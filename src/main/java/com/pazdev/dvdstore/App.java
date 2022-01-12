package com.pazdev.dvdstore;

import com.pazdev.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan({"com.pazdev.dvdstore.controller", "com.pazdev.dvdstore.service", "com.pazdev.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
