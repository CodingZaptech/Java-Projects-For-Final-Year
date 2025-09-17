package com.example.minigithub.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for repository management
@RestController
@RequestMapping("/repos")
public class RepoController {

    private Map<Long, Map<String, String>> repoStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllRepos() {
        return repoStore.values();
    }

    @PostMapping
    public Map<String, String> createRepo(@RequestBody Map<String, String> repo) {
        repo.put("id", String.valueOf(idCounter));
        repoStore.put(idCounter, repo);
        idCounter++;
        return repo;
    }

    @DeleteMapping("/{id}")
    public String deleteRepo(@PathVariable Long id) {
        repoStore.remove(id);
        return "Repository with id " + id + " deleted.";
    }
}
