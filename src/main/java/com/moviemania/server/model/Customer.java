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
@Table (name = "customer")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long customerId;
	private String customerName;
	private String customerPassword;
	private LocalDate dateOfBirth;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "tickets_id")
    private List<Ticket> myTickets;
	private String customerContact;
}
