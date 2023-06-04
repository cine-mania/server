package com.moviemania.server.repository;

import com.moviemania.server.model.Admin;
import com.moviemania.server.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
