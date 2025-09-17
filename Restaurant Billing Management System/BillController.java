package com.example.restaurantbilling.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing restaurant bills
@RestController
@RequestMapping("/bills")
public class BillController {

    private Map<Long, Map<String, String>> billStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllBills() {
        return billStore.values();
    }

    @PostMapping
    public Map<String, String> createBill(@RequestBody Map<String, String> bill) {
        bill.put("id", String.valueOf(idCounter));
        bill.put("timestamp", new Date().toString());
        billStore.put(idCounter, bill);
        idCounter++;
        return bill;
    }

    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable Long id) {
        billStore.remove(id);
        return "Bill with id " + id + " deleted.";
    }
}
