package com.example.library.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing books
@RestController
@RequestMapping("/books")
public class BookController {

    private Map<Long, Map<String, String>> bookStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllBooks() {
        return bookStore.values();
    }

    @PostMapping
    public Map<String, String> addBook(@RequestBody Map<String, String> book) {
        book.put("id", String.valueOf(idCounter));
        bookStore.put(idCounter, book);
        idCounter++;
        return book;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookStore.remove(id);
        return "Book with id " + id + " deleted.";
    }
}
