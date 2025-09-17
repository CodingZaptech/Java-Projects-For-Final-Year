package com.example.vaccination.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for vaccination registrations
@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    private Map<Long, Map<String, String>> registrationStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllRegistrations() {
        return registrationStore.values();
    }

    @PostMapping
    public Map<String, String> addRegistration(@RequestBody Map<String, String> registration) {
        registration.put("id", String.valueOf(idCounter));
        registration.put("timestamp", new Date().toString());
        registrationStore.put(idCounter, registration);
        idCounter++;
        return registration;
    }

    @DeleteMapping("/{id}")
    public String deleteRegistration(@PathVariable Long id) {
        registrationStore.remove(id);
        return "Registration with id " + id + " deleted.";
    }
}
