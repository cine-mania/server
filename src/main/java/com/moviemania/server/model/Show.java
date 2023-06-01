package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long showId;
    private Time showStartTime;
    private Time showEndTime;
    private List<Seat> seats;
    private String showName;
    private Movie movieName;
    private long screenId;
    private long theaterId;
}
