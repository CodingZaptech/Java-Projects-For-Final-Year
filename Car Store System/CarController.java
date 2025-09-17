package com.example.carstore.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing cars
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
