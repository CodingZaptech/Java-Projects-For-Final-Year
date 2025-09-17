package com.example.electricity.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing electricity meters
@RestController
@RequestMapping("/meters")
public class MeterController {

    private Map<Long, Map<String, String>> meterStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllMeters() {
        return meterStore.values();
    }

    @PostMapping
    public Map<String, String> addMeter(@RequestBody Map<String, String> meter) {
        meter.put("id", String.valueOf(idCounter));
        meter.put("timestamp", new Date().toString());
        meterStore.put(idCounter, meter);
        idCounter++;
        return meter;
    }

    @DeleteMapping("/{id}")
    public String deleteMeter(@PathVariable Long id) {
        meterStore.remove(id);
        return "Meter with id " + id + " deleted.";
    }
}
