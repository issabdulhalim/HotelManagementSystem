package com.example.HotelManagementSystem.Repository;

import com.example.HotelManagementSystem.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {}