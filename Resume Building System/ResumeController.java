package com.example.resume.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing resumes
@RestController
@RequestMapping("/resumes")
public class ResumeController {

    private Map<Long, Map<String, String>> resumeStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllResumes() {
        return resumeStore.values();
    }

    @PostMapping
    public Map<String, String> createResume(@RequestBody Map<String, String> resume) {
        resume.put("id", String.valueOf(idCounter));
        resume.put("timestamp", new Date().toString());
        resumeStore.put(idCounter, resume);
        idCounter++;
        return resume;
    }

    @DeleteMapping("/{id}")
    public String deleteResume(@PathVariable Long id) {
        resumeStore.remove(id);
        return "Resume with id " + id + " deleted.";
    }
}
