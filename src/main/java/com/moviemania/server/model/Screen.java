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
    @Column(nullable = false)
    private long screenId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Theatre theatres;
    @Column(nullable = false)
    private String screenName;
    @OneToMany
    @JoinColumn(name = "showsId")
    private List<Show> showList;
    @Column(nullable = false)
    private LocalDate movieEndDate;
    @Column(nullable = false)
    private int numberOfrows;
    @Column(nullable = false)
    private int numberOfcolumns;
}
