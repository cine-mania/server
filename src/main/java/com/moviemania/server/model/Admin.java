package com.moviemania.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long adminId;
	private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private String adminContact;
}
