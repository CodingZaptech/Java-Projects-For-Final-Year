package com.example.weatherinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Weather Information System application.
 * 
 * This class starts the Spring Boot application which provides
 * endpoints to fetch, view, and delete weather data.
 */
@SpringBootApplication
public class WeatherInfoApplication {

    /**
     * Main method that bootstraps the Spring Boot application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(WeatherInfoApplication.class, args);
    }
}
