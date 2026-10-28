package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Service;
import com.example.HotelManagementSystem.Repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepository repo;
    public List<Service> getAll() { return repo.findAll(); }
    public Service getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Service not found: "+id)); }
    public Service create(Service e) { return repo.save(e); }
    public Service update(Long id, Service e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
