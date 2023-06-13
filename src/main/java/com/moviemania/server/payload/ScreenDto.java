package com.moviemania.server.payload;

import com.moviemania.server.model.Show;
import com.moviemania.server.model.Theatre;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
public class ScreenDto {

    private long screenId;
    private String screenName;
    private String movieEndDate;
    private int numberOfrows;
    private int numberOfcolumns;

}
