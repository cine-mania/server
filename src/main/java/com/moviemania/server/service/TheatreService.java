package com.moviemania.server.service;


import com.moviemania.server.payload.TheatreDto;
import org.springframework.stereotype.Service;

@Service
public interface TheatreService {
    TheatreDto addTheatre(TheatreDto theatreDto);
    void deleteTheatre(Integer id);
}
