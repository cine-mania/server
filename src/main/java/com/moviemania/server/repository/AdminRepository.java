package com.moviemania.server.repository;

import com.moviemania.server.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository <Admin, Integer> {
}
