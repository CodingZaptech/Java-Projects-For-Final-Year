package com.example.atm.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing ATMs
@RestController
@RequestMapping("/atms")
public class ATMController {

    private Map<Long, Map<String, String>> atmStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllATMs() {
        return atmStore.values();
    }

    @PostMapping
    public Map<String, String> addATM(@RequestBody Map<String, String> atm) {
        atm.put("id", String.valueOf(idCounter));
        atmStore.put(idCounter, atm);
        idCounter++;
        return atm;
    }

    @DeleteMapping("/{id}")
    public String deleteATM(@PathVariable Long id) {
        atmStore.remove(id);
        return "ATM with id " + id + " deleted.";
    }
}
