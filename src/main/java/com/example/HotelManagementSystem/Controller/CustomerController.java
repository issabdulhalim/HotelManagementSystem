package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Customer;
import com.example.HotelManagementSystem.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    private final CustomerService service;
    @GetMapping
    public List<Customer> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Customer getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Customer create(@RequestBody Customer e) { return service.create(e); }
    @PutMapping("/{id}") public Customer update(@PathVariable Long id, @RequestBody Customer e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Customer deleted"; }
}
