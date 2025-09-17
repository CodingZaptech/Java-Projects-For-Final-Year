package com.example.idcard.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for managing ID cards.
 * 
 * Provides endpoints to generate new ID cards,
 * view all cards, and delete specific ones.
 */
@RestController
@RequestMapping("/idcards")
public class IdCardController {

    // Stores ID card data with integer ID
    private final Map<Integer, String> idCards = new HashMap<>();
    private int idCounter = 1;

    /**
     * Generates a new ID card.
     * @param personName name of the person
     * @return confirmation message
     */
    @PostMapping
    public String generateIdCard(@RequestBody String personName) {
        idCards.put(idCounter++, "ID Card for: " + personName);
        return "ID card generated!";
    }

    /**
     * Retrieves all generated ID cards.
     * @return collection of ID cards
     */
    @GetMapping
    public Collection<String> getAllIdCards() {
        return idCards.values();
    }

    /**
     * Deletes an ID card by ID.
     * @param id the card ID
     * @return confirmation message
     */
    @DeleteMapping("/{id}")
    public String deleteIdCard(@PathVariable int id) {
        idCards.remove(id);
        return "ID card deleted!";
    }
}
