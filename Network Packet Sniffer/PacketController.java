package com.example.packetlog.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * REST controller for the Packet Log Viewer.
 *
 * This controller stores "packet entries" supplied by the user.
 * Each entry is a Map (free-form) — e.g., fields like timestamp, srcIp, dstIp, protocol, length, info.
 */
@RestController
@RequestMapping("/packets")
public class PacketController {

    private final Map<Integer, Map<String, Object>> packetStore = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public Map<String, Object> addPacket(@RequestBody Map<String, Object> packet) {
        int id = idCounter++;
        packet.put("id", id);
        packetStore.put(id, new HashMap<>(packet));
        return Map.of("stored", packet);
    }

    @GetMapping
    public Collection<Map<String, Object>> listPackets() {
        return packetStore.values();
    }

    @GetMapping("/{id}")
    public Map<String, Object> getPacket(@PathVariable int id) {
        return packetStore.get(id);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deletePacket(@PathVariable int id) {
        packetStore.remove(id);
        return Map.of("message", "Packet entry deleted", "id", String.valueOf(id));
    }
}
