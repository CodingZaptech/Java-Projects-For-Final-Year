package com.example.payslip.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing pay slips
@RestController
@RequestMapping("/payslips")
public class PaySlipController {

    private Map<Long, Map<String, String>> paySlipStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllPaySlips() {
        return paySlipStore.values();
    }

    @PostMapping
    public Map<String, String> generatePaySlip(@RequestBody Map<String, String> paySlip) {
        paySlip.put("id", String.valueOf(idCounter));
        paySlip.put("timestamp", new Date().toString());
        paySlipStore.put(idCounter, paySlip);
        idCounter++;
        return paySlip;
    }

    @DeleteMapping("/{id}")
    public String deletePaySlip(@PathVariable Long id) {
        paySlipStore.remove(id);
        return "Pay slip with id " + id + " deleted.";
    }
}
