package com.example.texteditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Text Editor backend application.
 *
 * This class bootstraps the Spring Boot application which exposes simple
 * REST endpoints to create, read, update, and delete text documents.
 */
@SpringBootApplication
public class TextEditorApplication {

    /**
     * Main method that starts the Spring Boot application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TextEditorApplication.class, args);
    }
}
