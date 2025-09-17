package com.example.dataviz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Data Visualization Software backend.
 * 
 * This Spring Boot application provides endpoints 
 * to add datasets, view datasets, and delete datasets.
 */
@SpringBootApplication
public class DataVizApplication {

    /**
     * Main method that runs the Data Visualization backend.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DataVizApplication.class, args);
    }
}
