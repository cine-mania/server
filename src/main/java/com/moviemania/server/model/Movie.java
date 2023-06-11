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
@Table(
        name = "movie", uniqueConstraints = {@UniqueConstraint(columnNames = {"movieName"})}
)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;
    @Column(nullable = false)
    private String movieName;
    @Column(nullable = false)
    private String movieGenre;
    @Column(nullable = false)
    private String movieDirector;
    @Column(nullable = false)
    private int movieLength;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "shows_shows_id")
    private List<Show> shows;
    @Column(nullable = false)
    private String language;
    @Column(nullable = false)
    private String movieReleaseDate;
}
