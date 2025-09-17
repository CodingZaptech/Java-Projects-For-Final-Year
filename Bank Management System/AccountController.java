package com.example.bank.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing bank accounts
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private Map<Long, Map<String, String>> accountStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllAccounts() {
        return accountStore.values();
    }

    @PostMapping
    public Map<String, String> createAccount(@RequestBody Map<String, String> account) {
        account.put("id", String.valueOf(idCounter));
        account.put("timestamp", new Date().toString());
        accountStore.put(idCounter, account);
        idCounter++;
        return account;
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountStore.remove(id);
        return "Account with id " + id + " deleted.";
    }
}
