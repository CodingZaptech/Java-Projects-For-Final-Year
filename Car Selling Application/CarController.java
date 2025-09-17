package com.example.carselling.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing car listings
@RestController
@RequestMapping("/cars")
public class CarController {

    private Map<Long, Map<String, String>> carStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllCars() {
        return carStore.values();
    }

    @PostMapping
    public Map<String, String> addCar(@RequestBody Map<String, String> car) {
        car.put("id", String.valueOf(idCounter));
        car.put("timestamp", new Date().toString());
        carStore.put(idCounter, car);
        idCounter++;
        return car;
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id) {
        carStore.remove(id);
        return "Car with id " + id + " deleted.";
    }
}
