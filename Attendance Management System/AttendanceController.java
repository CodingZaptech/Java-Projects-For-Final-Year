package com.example.attendance.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// Minimal Controller for managing attendance
@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    private Map<Long, Map<String, String>> attendanceStore = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public Collection<Map<String, String>> getAllRecords() {
        return attendanceStore.values();
    }

    @PostMapping
    public Map<String, String> addRecord(@RequestBody Map<String, String> record) {
        record.put("id", String.valueOf(idCounter));
        record.put("timestamp", new Date().toString());
        attendanceStore.put(idCounter, record);
        idCounter++;
        return record;
    }

    @DeleteMapping("/{id}")
    public String deleteRecord(@PathVariable Long id) {
        attendanceStore.remove(id);
        return "Attendance record with id " + id + " deleted.";
    }
}
