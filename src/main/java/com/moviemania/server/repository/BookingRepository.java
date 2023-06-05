package com.moviemania.server.repository;

import com.moviemania.server.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< Updated upstream
public interface BookingRepository extends JpaRepository<Booking, Integer> {
=======
public interface BookingRepository extends JpaRepository<Booking,Long> {

>>>>>>> Stashed changes
}
