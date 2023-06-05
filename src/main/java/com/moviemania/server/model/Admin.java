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
@Table(
        name = "admin", uniqueConstraints = {@UniqueConstraint(columnNames = {"adminName", "adminContact"})}
)
public class Admin {
    @Id
<<<<<<< Updated upstream
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;
    @Column(nullable = false)
    private String adminName;
    @Column(nullable = false)
    private String adminPassword;
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    private String adminContact;
=======
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long adminId;
	@Column(name="adminName",nullable = false)
	private String adminName;
	@Column(name="adminPassword",nullable = false)
	private String adminPassword;
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	@Column(name = "adminContact",nullable = false)
	private String adminContact;
>>>>>>> Stashed changes
}
