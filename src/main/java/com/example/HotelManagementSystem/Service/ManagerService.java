package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Manager;
import com.example.HotelManagementSystem.Model.Staff;
import com.example.HotelManagementSystem.Repository.ManagerRepository;
import com.example.HotelManagementSystem.Repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerService {
    private final ManagerRepository repo;
    public List<Manager> getAll() { return repo.findAll(); }
    public Manager getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Manager not found: "+id)); }
    public Manager create(Manager e) { return repo.save(e); }
    public Manager update(Long id, Manager e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
