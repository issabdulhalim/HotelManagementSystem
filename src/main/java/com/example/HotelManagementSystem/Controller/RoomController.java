package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Room;
import com.example.HotelManagementSystem.Service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
@CrossOrigin
public class RoomController {
    private final RoomService service;
    @GetMapping
    public List<Room> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Room getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Room create(@RequestBody Room e) { return service.create(e); }
    @PutMapping("/{id}") public Room update(@PathVariable Long id, @RequestBody Room e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Room deleted"; }
}
