package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Hotel;
import com.example.HotelManagementSystem.Model.Staff;
import com.example.HotelManagementSystem.Repository.HotelRepository;
import com.example.HotelManagementSystem.Repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffService {
    private final StaffRepository repo;
    public List<Staff> getAll() { return repo.findAll(); }
    public Staff getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Staff not found: "+id)); }
    public Staff create(Staff e) { return repo.save(e); }
    public Staff update(Long id, Staff e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
