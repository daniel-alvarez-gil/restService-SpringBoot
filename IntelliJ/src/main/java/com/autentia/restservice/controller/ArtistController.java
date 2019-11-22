package com.autentia.restservice.controller;

import com.autentia.restservice.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping()
    private String getAllArtists() {
        return "Hola desde ArtistController";
    }


}
