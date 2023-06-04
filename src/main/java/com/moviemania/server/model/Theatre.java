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
    private int theaterId;
    private String theaterName;
    private String theaterCity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_list")
     private Movie movies;
      @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "theatres")
       private List<Screen> listOfScreens;
    private String managerName;
    private String managerContact;
}
