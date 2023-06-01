package com.moviemania.server.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
	private int adminId;
	private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private String adminContact;
}
