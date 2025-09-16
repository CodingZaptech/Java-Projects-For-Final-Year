package com.example.stockmarket.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for stock monitoring
@RestController
@RequestMapping("/stocks")
public class StockController {

    // In-memory stock store
    private Map<String, Map<String, String>> stockStore = new HashMap<>();

    // Get all stocks
    @GetMapping
    public Collection<Map<String, String>> getAllStocks() {
        return stockStore.values();
    }

    // Add or update stock
    @PostMapping
    public Map<String, String> updateStock(@RequestBody Map<String, String> stock) {
        String symbol = stock.get("symbol");
        stock.put("lastUpdated", new Date().toString());
        stockStore.put(symbol, stock);
        return stock;
    }

    // Delete a stock
    @DeleteMapping("/{symbol}")
    public String deleteStock(@PathVariable String symbol) {
        stockStore.remove(symbol);
        return "Stock " + symbol + " deleted.";
    }
}
