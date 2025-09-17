package com.example.texteditor.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for a minimal Text Editor backend.
 *
 * This controller stores documents in an in-memory map (id -> document content).
 * It provides endpoints to create documents, read by id, update, list all, and delete.
 */
@RestController
@RequestMapping("/documents")
public class EditorController {

    // Simple in-memory store for documents. Key: id, Value: map with fields title & content
    private final Map<Integer, Map<String, String>> docs = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public Map<String, String> createDocument(@RequestBody Map<String, String> payload) {
        int id = idCounter++;
        Map<String, String> doc = new HashMap<>();
        doc.put("id", String.valueOf(id));
        doc.put("title", payload.getOrDefault("title", "Untitled"));
        doc.put("content", payload.getOrDefault("content", ""));
        docs.put(id, doc);
        return doc;
    }

    @GetMapping("/{id}")
    public Map<String, String> getDocument(@PathVariable int id) {
        return docs.get(id);
    }

    @PutMapping("/{id}")
    public Object updateDocument(@PathVariable int id, @RequestBody Map<String, String> payload) {
        Map<String, String> doc = docs.get(id);
        if (doc == null) {
            return Map.of("error", "Document not found");
        }
        if (payload.containsKey("title")) doc.put("title", payload.get("title"));
        if (payload.containsKey("content")) doc.put("content", payload.get("content"));
        return doc;
    }

    @GetMapping
    public Collection<Map<String, String>> listDocuments() {
        return docs.values();
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteDocument(@PathVariable int id) {
        docs.remove(id);
        return Map.of("message", "Document deleted", "id", String.valueOf(id));
    }
}
