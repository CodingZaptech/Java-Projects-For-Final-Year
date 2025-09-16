package com.example.school.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for student management
@RestController
@RequestMapping("/students")
public class StudentController {

    private Map<Long, Map<String, String>> studentStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllStudents() {
        return studentStore.values();
    }

    @PostMapping
    public Map<String, String> addStudent(@RequestBody Map<String, String> student) {
        student.put("id", String.valueOf(idCounter));
        studentStore.put(idCounter, student);
        idCounter++;
        return student;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentStore.remove(id);
        return "Student with id " + id + " deleted.";
    }
}
