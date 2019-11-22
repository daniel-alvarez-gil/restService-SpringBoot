package com.autentia.restservice.controller;

import com.autentia.restservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {


    @Autowired
    SongService songService;

    @GetMapping()
    private String getAllSongs() {
        return "Hola desde SongController";
    }


}
