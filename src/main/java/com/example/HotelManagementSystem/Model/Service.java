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
@Table(name = "hotel_service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private Double charge;
    @ManyToOne @JoinColumn(name = "room_id")
    private Room room;
    @ManyToOne @JoinColumn(name = "customer_id")
    private Customer customer;
}
