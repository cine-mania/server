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
@Table (name = "customer")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int customerId;
	private String customerName;
	private String customerPassword;
	private LocalDate dateOfBirth;
	private List<Ticket> myTickets;
	private String customerContact;
}
