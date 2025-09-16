package com.example.textanimation.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing animations
@RestController
@RequestMapping("/animations")
public class AnimationController {

    // Using an in-memory store for simplicity
    private Map<Long, Map<String, String>> animationStore = new HashMap<>();
    private long idCounter = 1;

    // Get all animations
    @GetMapping
    public Collection<Map<String, String>> getAllAnimations() {
        return animationStore.values();
    }

    // Get animation by id
    @GetMapping("/{id}")
    public Map<String, String> getAnimationById(@PathVariable Long id) {
        return animationStore.get(id);
    }

    // Create new animation
    @PostMapping
    public Map<String, String> createAnimation(@RequestBody Map<String, String> animation) {
        animation.put("id", String.valueOf(idCounter));
        animationStore.put(idCounter, animation);
        idCounter++;
        return animation;
    }

    // Delete animation
    @DeleteMapping("/{id}")
    public String deleteAnimation(@PathVariable Long id) {
        animationStore.remove(id);
        return "Animation with id " + id + " deleted.";
    }
}
