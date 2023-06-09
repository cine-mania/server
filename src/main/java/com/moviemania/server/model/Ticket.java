package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ticketId;
    private long noOfSeats;
    private String seatName;
    @OneToOne
    @JoinColumn(name = "booking_ref_booking_id")
    private Booking bookingRef;
    private Boolean ticketStatus;
    private String screenName;
}
