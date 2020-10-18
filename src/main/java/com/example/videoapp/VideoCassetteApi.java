package com.example.videoapp;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoCassetteApi {
   private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        this.videoCassettes = videoCassettes;
        videoCassettes.add(new VideoCassette());
    }
}
