package com.example.HotelManagementSystem.Controller;

import com.example.HotelManagementSystem.Model.Payment;
import com.example.HotelManagementSystem.Service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
@CrossOrigin
public class PaymentController {
    private final PaymentService service;
    @GetMapping
    public List<Payment> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Payment getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping
    public Payment create(@RequestBody Payment e) { return service.create(e); }
    @PutMapping("/{id}") public Payment update(@PathVariable Long id, @RequestBody Payment e) { return service.update(id,e); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Payment deleted"; }
}
