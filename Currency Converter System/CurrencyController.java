package com.example.currencyconverter.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for currency conversion
@RestController
@RequestMapping("/convert")
public class CurrencyController {

    // Minimal in-memory exchange rates (example)
    private Map<String, Double> rates = Map.of(
            "USD_TO_EUR", 0.93,
            "EUR_TO_USD", 1.08,
            "USD_TO_INR", 83.50,
            "INR_TO_USD", 0.012
    );

    @GetMapping
    public Map<String, String> convertCurrency(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {

        String key = from.toUpperCase() + "_TO_" + to.toUpperCase();
        double rate = rates.getOrDefault(key, 1.0);
        double converted = amount * rate;

        Map<String, String> response = new HashMap<>();
        response.put("from", from);
        response.put("to", to);
        response.put("originalAmount", String.valueOf(amount));
        response.put("convertedAmount", String.valueOf(converted));
        response.put("rateUsed", String.valueOf(rate));
        return response;
    }
}
