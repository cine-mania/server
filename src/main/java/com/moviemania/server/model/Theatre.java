package com.moviemania.server.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "theatre")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int theaterId;
    private String theaterName;
    private String theaterCity;
    private List<Movie> movies;
    private List<Screen> listOfScreens;
    private String managerName;
    private String managerContact;
}
