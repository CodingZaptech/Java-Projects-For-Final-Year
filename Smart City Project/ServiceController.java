package com.example.smartcity.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for smart city services
@RestController
@RequestMapping("/services")
public class ServiceController {

    private Map<Long, Map<String, String>> serviceStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllServices() {
        return serviceStore.values();
    }

    @PostMapping
    public Map<String, String> addService(@RequestBody Map<String, String> service) {
        service.put("id", String.valueOf(idCounter));
        service.put("timestamp", new Date().toString());
        serviceStore.put(idCounter, service);
        idCounter++;
        return service;
    }

    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable Long id) {
        serviceStore.remove(id);
        return "Service with id " + id + " deleted.";
    }
}
