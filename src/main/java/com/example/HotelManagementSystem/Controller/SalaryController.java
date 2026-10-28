package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Salary;
import com.example.HotelManagementSystem.Service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salarys")
@RequiredArgsConstructor
@CrossOrigin
public class SalaryController {
    private final SalaryService service;
    @GetMapping
    public List<Salary> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Salary getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Salary create(@RequestBody Salary e) { return service.create(e); }
    @PutMapping("/{id}") public Salary update(@PathVariable Long id, @RequestBody Salary e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Salary deleted"; }
}
