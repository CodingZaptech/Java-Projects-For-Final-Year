package com.example.socialnetworking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Social Networking Site backend.
 * 
 * This Spring Boot application exposes minimal REST APIs
 * to manage users and their posts in a social platform.
 */
@SpringBootApplication
public class SocialNetworkingApplication {

    /**
     * Main method that starts the Social Networking Site backend.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SocialNetworkingApplication.class, args);
    }
}
