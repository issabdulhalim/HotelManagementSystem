package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Hotel;
import com.example.HotelManagementSystem.Service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels") // /api/staffs, /api/managers, /api/rooms, /api/salarys, /api/customers, /api/services, /api/payments
@RequiredArgsConstructor
@CrossOrigin
public class HotelController {
    private final HotelService service;
    @GetMapping
    public List<Hotel> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Hotel getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Hotel create(@RequestBody Hotel e) { return service.create(e); }
    @PutMapping("/{id}") public Hotel update(@PathVariable Long id, @RequestBody Hotel e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Hotel deleted"; }
}
