package com.example.packetlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Packet Log Viewer application.
 *
 * This application accepts user-provided packet log entries (JSON)
 * and exposes simple REST APIs to view and manage those logs.
 */
@SpringBootApplication
public class PacketLogApplication {

    /**
     * Main method that starts the Packet Log Viewer backend.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(PacketLogApplication.class, args);
    }
}
