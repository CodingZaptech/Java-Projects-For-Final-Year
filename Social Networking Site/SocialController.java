package com.example.socialnetworking.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for the Social Networking Site.
 * 
 * Provides minimal endpoints to create user posts,
 * view all posts, and delete posts.
 */
@RestController
@RequestMapping("/posts")
public class SocialController {

    // Stores posts with ID as key
    private final Map<Integer, String> posts = new HashMap<>();
    private int idCounter = 1;

    /**
     * Creates a new post for the social site.
     * @param content the post content
     * @return confirmation message
     */
    @PostMapping
    public String createPost(@RequestBody String content) {
        posts.put(idCounter++, content);
        return "Post created successfully!";
    }

    /**
     * Retrieves all posts from the social site.
     * @return collection of posts
     */
    @GetMapping
    public Collection<String> getAllPosts() {
        return posts.values();
    }

    /**
     * Deletes a post by its ID.
     * @param id the ID of the post
     * @return confirmation message
     */
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable int id) {
        posts.remove(id);
        return "Post deleted!";
    }
}
