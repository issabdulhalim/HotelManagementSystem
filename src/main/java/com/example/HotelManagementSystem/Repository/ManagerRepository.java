package com.example.HotelManagementSystem.Repository;

import com.example.HotelManagementSystem.Model.Manager;
//import com.example.HotelManagementSystem.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {}