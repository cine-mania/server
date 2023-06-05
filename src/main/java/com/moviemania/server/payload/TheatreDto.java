package com.moviemania.server.payload;

import lombok.Data;

@Data
public class TheatreDto {
    private int theaterId;
    private String theaterName;
    private String theaterCity;
    private String managerName;
    private String managerContact;

}
