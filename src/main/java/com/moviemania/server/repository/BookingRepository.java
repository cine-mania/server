package com.moviemania.server.repository;

import com.moviemania.server.model.Booking;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, Integer> {


}
