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
        name="movie",uniqueConstraints = {@UniqueConstraint(columnNames ={"movieName"} )}
)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;
    @Column(name="movieName",nullable = false)
    private String movieName;
    @Column(name="movieGenre",nullable = false)
    private String movieGenre;
  @Column(name="movieDirector" ,nullable = false)
    private LocalDate movieDirector;
    @Column(name="movieLength" ,nullable = false)
    private int movieLength;
 @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
 @JoinColumn(name = "showsm_id")
    private List<Show> shows;

    @Column(name="language" ,nullable = false)
   private String language;
    @Column(name="movieReleaseDate",nullable = false)
    private LocalDate movieReleaseDate;
}
