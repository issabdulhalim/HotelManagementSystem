package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Hotel;
import com.example.HotelManagementSystem.Repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository repo;
    public List<Hotel> getAll() { return repo.findAll(); }
    public Hotel getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Hotel not found: "+id)); }
    public Hotel create(Hotel e) { return repo.save(e); }
    public Hotel update(Long id, Hotel e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}
