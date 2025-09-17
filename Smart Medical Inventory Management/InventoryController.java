package com.example.medicalinventory.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing medical inventory
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private Map<Long, Map<String, String>> inventoryStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllItems() {
        return inventoryStore.values();
    }

    @PostMapping
    public Map<String, String> addItem(@RequestBody Map<String, String> item) {
        item.put("id", String.valueOf(idCounter));
        inventoryStore.put(idCounter, item);
        idCounter++;
        return item;
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        inventoryStore.remove(id);
        return "Item with id " + id + " deleted.";
    }
}
