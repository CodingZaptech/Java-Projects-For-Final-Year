package com.example.healthcare.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing patient data
@RestController
@RequestMapping("/patients")
public class PatientController {

    // In-memory storage for simplicity
    private Map<Long, Map<String, String>> patientStore = new HashMap<>();
    private long idCounter = 1;

    // Get all patients
    @GetMapping
    public Collection<Map<String, String>> getAllPatients() {
        return patientStore.values();
    }

    // Get patient by ID
    @GetMapping("/{id}")
    public Map<String, String> getPatientById(@PathVariable Long id) {
        return patientStore.get(id);
    }

    // Add new patient
    @PostMapping
    public Map<String, String> addPatient(@RequestBody Map<String, String> patient) {
        patient.put("id", String.valueOf(idCounter));
        patientStore.put(idCounter, patient);
        idCounter++;
        return patient;
    }

    // Delete patient
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientStore.remove(id);
        return "Patient with id " + id + " deleted.";
    }
}
