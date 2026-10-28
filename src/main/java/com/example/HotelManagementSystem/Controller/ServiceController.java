package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Service;
import com.example.HotelManagementSystem.Service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
@CrossOrigin
public class ServiceController {
    private final ServiceService service;
    @GetMapping
    public List<Service> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Service getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Service create(@RequestBody Service e) { return service.create(e); }
    @PutMapping("/{id}") public Service update(@PathVariable Long id, @RequestBody Service e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Service deleted"; }
}
