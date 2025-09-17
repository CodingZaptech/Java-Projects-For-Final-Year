package com.example.emailsignature.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing email signatures
@RestController
@RequestMapping("/signatures")
public class SignatureController {

    private Map<Long, Map<String, String>> signatureStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllSignatures() {
        return signatureStore.values();
    }

    @PostMapping
    public Map<String, String> createSignature(@RequestBody Map<String, String> signature) {
        signature.put("id", String.valueOf(idCounter));
        signature.put("timestamp", new Date().toString());
        signatureStore.put(idCounter, signature);
        idCounter++;
        return signature;
    }

    @DeleteMapping("/{id}")
    public String deleteSignature(@PathVariable Long id) {
        signatureStore.remove(id);
        return "Signature with id " + id + " deleted.";
    }
}
