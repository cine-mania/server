package com.moviemania.server.service.impl;

import com.moviemania.server.exception.ResourceNotFoundException;
import com.moviemania.server.model.User;
import com.moviemania.server.payload.UserDto;
import com.moviemania.server.repository.UserRepository;
import com.moviemania.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto registerNewUser(UserDto userDto) {
        User user = mapToModel(userDto);
        User newUser = userRepository.save(user);
        return mapToDto(newUser);
    }

    @Override
    public Boolean signIn(String userName, String password) {
        // Simple Basic Auth

        User user = userRepository.findByUserName(userName)
                .orElseThrow(() -> new ResourceNotFoundException("User", "User Name", userName));
        return Objects.equals(password, user.getPassword());
    }

    private UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        return userDto;
    }

    private User mapToModel(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        return user;
    }
}
