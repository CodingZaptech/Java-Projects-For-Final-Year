package com.example.schoolfinder.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for managing schools.
 * 
 * Provides endpoints to add schools, view all schools,
 * and delete schools from the system.
 */
@RestController
@RequestMapping("/schools")
public class SchoolController {

    // Stores school data with ID as key
    private final Map<Integer, String> schools = new HashMap<>();
    private int idCounter = 1;

    /**
     * Adds a new school.
     * @param schoolName name of the school
     * @return confirmation message
     */
    @PostMapping
    public String addSchool(@RequestBody String schoolName) {
        schools.put(idCounter++, schoolName);
        return "School added!";
    }

    /**
     * Retrieves all schools.
     * @return collection of school names
     */
    @GetMapping
    public Collection<String> getAllSchools() {
        return schools.values();
    }

    /**
     * Deletes a school by ID.
     * @param id the school ID
     * @return confirmation message
     */
    @DeleteMapping("/{id}")
    public String deleteSchool(@PathVariable int id) {
        schools.remove(id);
        return "School deleted!";
    }
}
