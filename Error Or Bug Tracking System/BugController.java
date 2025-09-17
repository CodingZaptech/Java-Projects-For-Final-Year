package com.example.bugtracker.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing bugs or errors
@RestController
@RequestMapping("/bugs")
public class BugController {

    private Map<Long, Map<String, String>> bugStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllBugs() {
        return bugStore.values();
    }

    @PostMapping
    public Map<String, String> addBug(@RequestBody Map<String, String> bug) {
        bug.put("id", String.valueOf(idCounter));
        bug.put("timestamp", new Date().toString());
        bugStore.put(idCounter, bug);
        idCounter++;
        return bug;
    }

    @DeleteMapping("/{id}")
    public String deleteBug(@PathVariable Long id) {
        bugStore.remove(id);
        return "Bug with id " + id + " deleted.";
    }
}
