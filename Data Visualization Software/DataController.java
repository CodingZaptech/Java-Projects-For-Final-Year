package com.example.dataviz.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for the Data Visualization Software.
 * 
 * Provides APIs to upload datasets, 
 * retrieve datasets, and delete them.
 */
@RestController
@RequestMapping("/datasets")
public class DataController {

    // Stores dataset information with ID
    private final Map<Integer, String> datasets = new HashMap<>();
    private int idCounter = 1;

    /**
     * Uploads a new dataset.
     * @param dataset dataset name or description
     * @return confirmation message
     */
    @PostMapping
    public String addDataset(@RequestBody String dataset) {
        datasets.put(idCounter++, dataset);
        return "Dataset added!";
    }

    /**
     * Retrieves all datasets.
     * @return collection of datasets
     */
    @GetMapping
    public Collection<String> getAllDatasets() {
        return datasets.values();
    }

    /**
     * Deletes a dataset by ID.
     * @param id dataset ID
     * @return confirmation message
     */
    @DeleteMapping("/{id}")
    public String deleteDataset(@PathVariable int id) {
        datasets.remove(id);
        return "Dataset deleted!";
    }
}
