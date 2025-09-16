package com.example.chatapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing chat messages
@RestController
@RequestMapping("/chats")
public class ChatController {

    // In-memory chat store
    private Map<Long, Map<String, String>> chatStore = new HashMap<>();
    private long messageIdCounter = 1;

    // Get all chat messages
    @GetMapping
    public Collection<Map<String, String>> getAllMessages() {
        return chatStore.values();
    }

    // Get a specific message by ID
    @GetMapping("/{id}")
    public Map<String, String> getMessageById(@PathVariable Long id) {
        return chatStore.get(id);
    }

    // Send a new chat message
    @PostMapping
    public Map<String, String> sendMessage(@RequestBody Map<String, String> message) {
        message.put("id", String.valueOf(messageIdCounter));
        message.put("timestamp", new Date().toString()); // Add timestamp
        chatStore.put(messageIdCounter, message);
        messageIdCounter++;
        return message;
    }

    // Delete a chat message
    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable Long id) {
        chatStore.remove(id);
        return "Message with id " + id + " deleted.";
    }
}
