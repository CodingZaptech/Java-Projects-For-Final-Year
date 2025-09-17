package com.example.wordcounter.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for counting words
@RestController
@RequestMapping("/wordcount")
public class WordController {

    @PostMapping
    public Map<String, Object> countWords(@RequestBody Map<String, String> request) {
        String text = request.getOrDefault("text", "");
        String[] words = text.trim().split("\\s+");
        int wordCount = text.isBlank() ? 0 : words.length;

        Map<String, Object> response = new HashMap<>();
        response.put("text", text);
        response.put("wordCount", wordCount);
        return response;
    }
}
