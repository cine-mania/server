package com.moviemania.server.controller;

import com.moviemania.server.model.User;
import com.moviemania.server.payload.UserDto;
import com.moviemania.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerNewUserController(@RequestBody UserDto userDto) {
        UserDto newUser = userService.registerNewUser(userDto);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signInController(@RequestBody UserDto userDto) {
        Boolean flag = userService.signIn(userDto.getUserName(), userDto.getPassword());
        return new ResponseEntity<>(flag, HttpStatus.CREATED);
    }
}
