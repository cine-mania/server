package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theatre")
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theaterId",nullable = false)
    private Integer theaterId;
    @Column(name="theaterName",nullable = false)
    private String theaterName;
    @Column(name = "theaterCity",nullable = false)
    private String theaterCity;
    private String managerName;
    private String managerContact;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_list")
    private Movie movies;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "theatres")
    private List<Screen> listOfScreens;


}
