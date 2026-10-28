package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Payment;
import com.example.HotelManagementSystem.Repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository repo;
    public List<Payment> getAll() { return repo.findAll(); }
    public Payment getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Payment not found: "+id)); }
    public Payment create(Payment e) { return repo.save(e); }
    public Payment update(Long id, Payment e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
