package com.example.weatherinfo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for managing weather information.
 * 
 * Provides endpoints to add new weather data, 
 * view all records, and delete specific records.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    // Stores weather data with an integer ID
    private final Map<Integer, String> weatherData = new HashMap<>();
    private int idCounter = 1;

    /**
     * Adds new weather information.
     * @param data the weather info (e.g., "Sunny, 28°C")
     * @return confirmation message
     */
    @PostMapping
    public String addWeather(@RequestBody String data) {
        weatherData.put(idCounter++, data);
        return "Weather data added!";
    }

    /**
     * Retrieves all weather information.
     * @return collection of weather data
     */
    @GetMapping
    public Collection<String> getAllWeather() {
        return weatherData.values();
    }

    /**
     * Deletes weather information by ID.
     * @param id the ID of the weather record
     * @return confirmation message
     */
    @DeleteMapping("/{id}")
    public String deleteWeather(@PathVariable int id) {
        weatherData.remove(id);
        return "Weather data deleted!";
    }
}
