package com.example.veterinary.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing pets
@RestController
@RequestMapping("/pets")
public class PetController {

    private Map<Long, Map<String, String>> petStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllPets() {
        return petStore.values();
    }

    @PostMapping
    public Map<String, String> addPet(@RequestBody Map<String, String> pet) {
        pet.put("id", String.valueOf(idCounter));
        petStore.put(idCounter, pet);
        idCounter++;
        return pet;
    }

    @DeleteMapping("/{id}")
    public String deletePet(@PathVariable Long id) {
        petStore.remove(id);
        return "Pet with id " + id + " deleted.";
    }
}
