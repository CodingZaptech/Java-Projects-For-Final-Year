package com.shortlink.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/links")
public class ShortLinkController {

    private final Map<String, String> links = new HashMap<>();

    @PostMapping
    public String generateShortLink(@RequestBody String url) {
        String shortKey = "sl" + (links.size() + 1);
        links.put(shortKey, url);
        return "Short link generated: " + shortKey;
    }

    @GetMapping("/{shortKey}")
    public String getOriginalUrl(@PathVariable String shortKey) {
        return links.getOrDefault(shortKey, "Short link not found!");
    }

    @DeleteMapping("/{shortKey}")
    public String deleteShortLink(@PathVariable String shortKey) {
        links.remove(shortKey);
        return "Short link deleted!";
    }
}
