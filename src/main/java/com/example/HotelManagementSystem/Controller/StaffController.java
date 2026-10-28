package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Staff;
import com.example.HotelManagementSystem.Service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
@RequiredArgsConstructor
@CrossOrigin
public class StaffController {
    private final StaffService service;
    @GetMapping
    public List<Staff> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Staff getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping public Staff create(@RequestBody Staff e) { return service.create(e); }
    @PutMapping("/{id}") public Staff update(@PathVariable Long id, @RequestBody Staff e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Staff deleted"; }
}
