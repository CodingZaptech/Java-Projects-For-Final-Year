package com.example.idcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the ID Card Generation System.
 * 
 * Provides REST APIs to create, view, and delete
 * ID card records for users.
 */
@SpringBootApplication
public class IdCardApplication {

    /**
     * Main method that runs the ID Card Generation app.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(IdCardApplication.class, args);
    }
}
