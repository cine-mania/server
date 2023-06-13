package com.moviemania.server.service;

import com.moviemania.server.payload.ScreenDto;

public interface ScreenService {
    ScreenDto addScreen(ScreenDto screenDto);
    void deleteScreen(long id);
}
