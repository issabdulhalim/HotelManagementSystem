package com.example.HotelManagementSystem.Repository;

import com.example.HotelManagementSystem.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {}
