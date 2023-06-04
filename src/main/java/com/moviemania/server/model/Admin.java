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
		name="admins",uniqueConstraints = {@UniqueConstraint(columnNames ={"adminPassword","adminContact"} )}
)
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long adminId;
	@Column(name="adminName",nullable = false)
	private String adminName;
	@Column(name="adminPassword",nullable = false)
	private String adminPassword;
	@Column(name = "dateofBirth",nullable = false)
	private LocalDate dateOfBirth;
	@Column(name = "adminContact",nullable = false)
	private String adminContact;
}
