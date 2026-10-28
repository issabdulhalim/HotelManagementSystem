package com.example.HotelManagementSystem.Repository;

import com.example.HotelManagementSystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
