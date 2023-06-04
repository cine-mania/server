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
    private Long seatId;
    @Column(nullable = false)
    private BookingState seatStatus;
    @Column(nullable = false)
    private double seatPrice;
    @ManyToOne
    @JoinColumn(name = "seats_id", nullable = false)
    private Show shows;

}
