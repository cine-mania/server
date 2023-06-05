package com.moviemania.server.repository;

import com.moviemania.server.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
<<<<<<< Updated upstream
=======
    //theatre primary key is int but here it is Integer may be we need to change
>>>>>>> Stashed changes
}
