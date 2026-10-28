package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Customer;
import com.example.HotelManagementSystem.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repo;
    public List<Customer> getAll() { return repo.findAll(); }
    public Customer getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found: "+id)); }
    public Customer create(Customer e) { return repo.save(e); }
    public Customer update(Long id, Customer e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
