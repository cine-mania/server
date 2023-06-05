package com.moviemania.server.repository;

import com.moviemania.server.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< Updated upstream
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
=======
public interface CustomerRepository extends JpaRepository<Customer,Long> {
>>>>>>> Stashed changes
}
