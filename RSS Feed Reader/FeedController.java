package com.example.rss.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing RSS feeds
@RestController
@RequestMapping("/feeds")
public class FeedController {

    private Map<Long, Map<String, String>> feedStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllFeeds() {
        return feedStore.values();
    }

    @PostMapping
    public Map<String, String> addFeed(@RequestBody Map<String, String> feed) {
        feed.put("id", String.valueOf(idCounter));
        feed.put("timestamp", new Date().toString());
        feedStore.put(idCounter, feed);
        idCounter++;
        return feed;
    }

    @DeleteMapping("/{id}")
    public String deleteFeed(@PathVariable Long id) {
        feedStore.remove(id);
        return "Feed with id " + id + " deleted.";
    }
}
