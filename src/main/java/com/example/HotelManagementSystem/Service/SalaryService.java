package com.example.HotelManagementSystem.Service;

import com.example.HotelManagementSystem.Model.Salary;
import com.example.HotelManagementSystem.Repository.SalaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalaryService {
    private final SalaryRepository repo;

    public List<Salary> getAll() {
        return repo.findAll();
    }

    public Salary getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Salary not found: " + id));
    }

    public Salary create(Salary e) {
        return repo.save(e);
    }

    public Salary update(Long id, Salary e) {
        e.setId(id);
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}