package com.example.schoolfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the School Finder System application.
 * 
 * This app provides a minimal backend to add schools,
 * view all schools, and remove schools from the list.
 */
@SpringBootApplication
public class SchoolFinderApplication {

    /**
     * Main method that starts the School Finder application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SchoolFinderApplication.class, args);
    }
}
