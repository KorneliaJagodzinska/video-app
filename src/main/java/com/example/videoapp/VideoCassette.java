package com.example.videoapp;

import lombok.Data;

import java.time.LocalDate;
@Data
public class VideoCassette {
    private Long id;
    private String title;
    private LocalDate productionYear;
}
