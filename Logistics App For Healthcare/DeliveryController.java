package com.example.logistics.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing logistics deliveries
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    private Map<Long, Map<String, String>> deliveryStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllDeliveries() {
        return deliveryStore.values();
    }

    @PostMapping
    public Map<String, String> addDelivery(@RequestBody Map<String, String> delivery) {
        delivery.put("id", String.valueOf(idCounter));
        deliveryStore.put(idCounter, delivery);
        idCounter++;
        return delivery;
    }

    @DeleteMapping("/{id}")
    public String deleteDelivery(@PathVariable Long id) {
        deliveryStore.remove(id);
        return "Delivery with id " + id + " deleted.";
    }
}
