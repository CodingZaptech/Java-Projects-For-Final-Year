package com.example.certificate.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing certificates
@RestController
@RequestMapping("/certificates")
public class CertificateController {

    private Map<Long, Map<String, String>> certificateStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllCertificates() {
        return certificateStore.values();
    }

    @PostMapping
    public Map<String, String> generateCertificate(@RequestBody Map<String, String> certificate) {
        certificate.put("id", String.valueOf(idCounter));
        certificate.put("timestamp", new Date().toString());
        certificateStore.put(idCounter, certificate);
        idCounter++;
        return certificate;
    }

    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable Long id) {
        certificateStore.remove(id);
        return "Certificate with id " + id + " deleted.";
    }
}
