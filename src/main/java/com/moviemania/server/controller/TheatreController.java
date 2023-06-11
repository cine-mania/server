package com.moviemania.server.controller;


import com.moviemania.server.payload.AdminDto;
import com.moviemania.server.payload.TheatreDto;
import com.moviemania.server.service.AdminService;
import com.moviemania.server.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/theatre")
public class TheatreController {
    @Autowired
    private TheatreService theatreService;
    @PostMapping("/register")
    public ResponseEntity<TheatreDto> registerTheatreController(@RequestBody TheatreDto theatreDto) {

        TheatreDto newTheatre=theatreService.addTheatre(theatreDto);
        return new ResponseEntity<>(newTheatre, HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteTheatreController(@PathVariable (name = "id") Integer id)
    {
        theatreService.deleteTheatre(id);
        return ResponseEntity.ok("Theatre delete succefully");
    }

}
