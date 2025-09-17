package com.example.adventuregame.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for the Text-Based Adventure Game.
 * 
 * Provides APIs to start a new adventure, 
 * list available actions, and reset the game.
 */
@RestController
@RequestMapping("/game")
public class GameController {

    // Stores simple game states
    private final List<String> actions = new ArrayList<>(Arrays.asList(
            "Go North", "Go South", "Pick up Sword", "Fight Monster"
    ));

    /**
     * Starts a new adventure.
     * @return starting message
     */
    @GetMapping("/start")
    public String startGame() {
        return "You find yourself in a dark forest. What do you do?";
    }

    /**
     * Lists available actions for the player.
     * @return list of actions
     */
    @GetMapping("/actions")
    public List<String> getActions() {
        return actions;
    }

    /**
     * Resets the game state.
     * @return confirmation message
     */
    @PostMapping("/reset")
    public String resetGame() {
        return "Game reset! Start again.";
    }
}
