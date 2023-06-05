package com.moviemania.server.controller;



import com.moviemania.server.payload.AdminDto;
import com.moviemania.server.service.AdminService;
import com.moviemania.server.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/register")
    public ResponseEntity<AdminDto> registerNewAdminController(@RequestBody AdminDto adminDto) {
        AdminDto newAdmin = adminService.createAdmin(adminDto);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }


}
