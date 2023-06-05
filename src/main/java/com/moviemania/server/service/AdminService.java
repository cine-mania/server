package com.moviemania.server.service;

import com.moviemania.server.payload.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


public interface AdminService {
     AdminDto createAdmin(AdminDto adminDto);
}
