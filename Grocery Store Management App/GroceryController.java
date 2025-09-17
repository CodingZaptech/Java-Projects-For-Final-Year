package com.grocery.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/groceries")
public class GroceryController {

    private final Map<Integer, String> groceries = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public String addGrocery(@RequestBody String item) {
        groceries.put(idCounter++, item);
        return "Grocery item added!";
    }

    @GetMapping
    public Collection<String> getAllGroceries() {
        return groceries.values();
    }

    @DeleteMapping("/{id}")
    public String deleteGrocery(@PathVariable int id) {
        groceries.remove(id);
        return "Grocery item deleted!";
    }
}
