package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    private long movieId;
    private long showId;
    private Show showRef;
    private LocalDate bookingDate;
    private long transactionId;
    private Double totalCost;
    private List<Seat> seatList;
    private Ticket ticket;
}
