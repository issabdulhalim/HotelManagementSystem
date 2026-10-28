package com.example.HotelManagementSystem.Repository;

import com.example.HotelManagementSystem.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {}
