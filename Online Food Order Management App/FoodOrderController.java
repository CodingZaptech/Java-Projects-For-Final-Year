package com.food.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/orders")
public class FoodOrderController {

    private final Map<Integer, String> orders = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public String placeOrder(@RequestBody String order) {
        orders.put(idCounter++, order);
        return "Order placed!";
    }

    @GetMapping
    public Collection<String> getAllOrders() {
        return orders.values();
    }

    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable int id) {
        orders.remove(id);
        return "Order canceled!";
    }
}
