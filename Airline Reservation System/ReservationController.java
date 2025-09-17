package com.example.airline.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing airline reservations
@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private Map<Long, Map<String, String>> reservationStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllReservations() {
        return reservationStore.values();
    }

    @PostMapping
    public Map<String, String> addReservation(@RequestBody Map<String, String> reservation) {
        reservation.put("id", String.valueOf(idCounter));
        reservation.put("timestamp", new Date().toString());
        reservationStore.put(idCounter, reservation);
        idCounter++;
        return reservation;
    }

    @DeleteMapping("/{id}")
    public String deleteReservation(@PathVariable Long id) {
        reservationStore.remove(id);
        return "Reservation with id " + id + " deleted.";
    }
}
