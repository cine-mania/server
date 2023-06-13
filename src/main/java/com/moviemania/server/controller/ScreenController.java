package com.moviemania.server.controller;

import com.moviemania.server.payload.MovieDto;
import com.moviemania.server.payload.ScreenDto;
import com.moviemania.server.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/screen")
public class ScreenController {
@Autowired
    private ScreenService screenService;
    @PostMapping("/register")
    public ResponseEntity<ScreenDto> registerScreenController(@RequestBody ScreenDto screenDto) {

        ScreenDto newScreen=screenService.addScreen(screenDto);
        return new ResponseEntity<>(newScreen, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteScreenController(@PathVariable (name = "id") long id)
    {
        screenService.deleteScreen(id);
        return ResponseEntity.ok("Screen delete succefully");
    }
}
