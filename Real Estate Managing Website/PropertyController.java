package com.example.realestate.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing real estate properties
@RestController
@RequestMapping("/properties")
public class PropertyController {

    private Map<Long, Map<String, String>> propertyStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllProperties() {
        return propertyStore.values();
    }

    @PostMapping
    public Map<String, String> addProperty(@RequestBody Map<String, String> property) {
        property.put("id", String.valueOf(idCounter));
        property.put("timestamp", new Date().toString());
        propertyStore.put(idCounter, property);
        idCounter++;
        return property;
    }

    @DeleteMapping("/{id}")
    public String deleteProperty(@PathVariable Long id) {
        propertyStore.remove(id);
        return "Property with id " + id + " deleted.";
    }
}
