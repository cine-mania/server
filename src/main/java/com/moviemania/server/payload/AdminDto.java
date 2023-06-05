package com.moviemania.server.payload;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Data
public class AdminDto {
    private long adminId;

    private String adminName;

    private String adminPassword;

    private String dateOfBirth;
    private String adminContact;

}
