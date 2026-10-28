package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Room;
import com.example.HotelManagementSystem.Repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository repo;
    public List<Room> getAll() { return repo.findAll(); }
    public Room getById(Long id) { return repo.findById(id).orElseThrow(() -> new RuntimeException("Room not found: "+id)); }
    public Room create(Room e) { return repo.save(e); }
    public Room update(Long id, Room e) { e.setId(id); return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}