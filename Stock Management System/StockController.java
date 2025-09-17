package com.example.stockmanagement.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing stock inventory
@RestController
@RequestMapping("/stocks")
public class StockController {

    private Map<Long, Map<String, String>> stockStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllStocks() {
        return stockStore.values();
    }

    @PostMapping
    public Map<String, String> addStock(@RequestBody Map<String, String> stock) {
        stock.put("id", String.valueOf(idCounter));
        stock.put("timestamp", new Date().toString());
        stockStore.put(idCounter, stock);
        idCounter++;
        return stock;
    }

    @DeleteMapping("/{id}")
    public String deleteStock(@PathVariable Long id) {
        stockStore.remove(id);
        return "Stock item with id " + id + " deleted.";
    }
}
