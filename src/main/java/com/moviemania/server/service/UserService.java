package com.moviemania.server.service;

import com.moviemania.server.payload.UserDto;

public interface UserService {
    UserDto registerNewUser(UserDto userDto);

    Boolean signIn(String userName, String password);
}
