package com.example.searchengine.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing search queries
@RestController
@RequestMapping("/queries")
public class QueryController {

    private Map<Long, Map<String, String>> queryStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllQueries() {
        return queryStore.values();
    }

    @PostMapping
    public Map<String, String> addQuery(@RequestBody Map<String, String> query) {
        query.put("id", String.valueOf(idCounter));
        query.put("timestamp", new Date().toString());
        queryStore.put(idCounter, query);
        idCounter++;
        return query;
    }

    @DeleteMapping("/{id}")
    public String deleteQuery(@PathVariable Long id) {
        queryStore.remove(id);
        return "Query with id " + id + " deleted.";
    }
}
