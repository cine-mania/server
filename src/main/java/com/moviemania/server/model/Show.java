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
    @Column(name = "showId",nullable = false)
    private long showId;
    @Column(name="showStartTime",nullable = false)
    private Time showStartTime;
    @Column(name ="showEndTime" ,nullable = false)
    private Time showEndTime;
    @Column(name = "showName",nullable = false)
    private String showName;
    @Column(name = "movieName",nullable = false)
    private long screenId;
    @Column(name = "theaterId",nullable = false)
    private long theaterId;
    @OneToMany(mappedBy = "shows",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Seat> seats;


}
