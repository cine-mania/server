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
@Table(name = "show_table")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id",nullable = false)
    private long showId;
    @Column(nullable = false)
    private Time showStartTime;
    @Column(nullable = false)
    private Time showEndTime;
    @Column(nullable = false)
    private String showName;
    @Column(nullable = false)
    private long screenId;
    @Column(nullable = false)
    private long theaterId;
    @OneToMany(mappedBy = "shows", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Seat> seats;


}
