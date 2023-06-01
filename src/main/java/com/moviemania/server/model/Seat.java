package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum BookingState {
    AVAILABLE, BLOCKED, BOOKED
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seatId;
    private BookingState seatStatus;
    private Double seatPrice;
}
