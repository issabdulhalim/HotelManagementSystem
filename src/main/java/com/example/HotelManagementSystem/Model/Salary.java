package com.example.HotelManagementSystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String month;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
    @ManyToOne @JoinColumn(name = "manager_id")
    private Manager manager;
}
