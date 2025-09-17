package com.example.adventuregame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Text-Based Adventure Game backend.
 * 
 * This Spring Boot application provides minimal APIs to 
 * play a text-based adventure game with actions and story events.
 */
@SpringBootApplication
public class AdventureGameApplication {

    /**
     * Main method to run the Adventure Game backend.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AdventureGameApplication.class, args);
    }
}
