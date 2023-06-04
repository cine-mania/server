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
@Table(name = "screen_table")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "screenId",nullable = false)
    private long screenId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatres_Id")
   private Theatre theatres;
   @Column(name = "screenName",nullable = false)
    private String screenName;
   @OneToMany
   @JoinColumn(name="showsId")
   private List<Show> showList;
    @Column(name="movieEndDate",nullable = false)
     private LocalDate movieEndDate;
    @Column(name="numberOfrows",nullable = false)
    private int numberOfrows;
    @Column(name="numbrOfcolumns",nullable = false)
    private int numberOfcolumns;
}
