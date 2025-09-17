package com.example.voting.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing votes
@RestController
@RequestMapping("/votes")
public class VoteController {

    private Map<Long, Map<String, String>> voteStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllVotes() {
        return voteStore.values();
    }

    @PostMapping
    public Map<String, String> castVote(@RequestBody Map<String, String> vote) {
        vote.put("id", String.valueOf(idCounter));
        vote.put("timestamp", new Date().toString());
        voteStore.put(idCounter, vote);
        idCounter++;
        return vote;
    }

    @DeleteMapping("/{id}")
    public String deleteVote(@PathVariable Long id) {
        voteStore.remove(id);
        return "Vote with id " + id + " deleted.";
    }
}
