package com.example.HotelManagementSystem.Controller;
import com.example.HotelManagementSystem.Model.Manager;
import com.example.HotelManagementSystem.Service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/managers")
@RequiredArgsConstructor
@CrossOrigin
public class ManagerController {
    private final ManagerService service;
    @GetMapping
    public List<Manager> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Manager getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping public Manager create(@RequestBody Manager e) { return service.create(e); }
    @PutMapping("/{id}") public Manager update(@PathVariable Long id, @RequestBody Manager e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Manager deleted"; }
}
