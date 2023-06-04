package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name="seat",uniqueConstraints = {@UniqueConstraint(columnNames ={"seatId"} )}
)
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  seatId;
    @Column(name = "seatStatus")
    private  boolean seatStatus;
    @Column(name = "seatPrice",nullable = false)
    private double seatPrice;
    @ManyToOne
    @JoinColumn(name="seats_id", nullable=false)
    private  Show shows;

}
