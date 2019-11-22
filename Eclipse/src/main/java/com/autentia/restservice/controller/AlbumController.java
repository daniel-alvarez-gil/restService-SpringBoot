package com.autentia.restservice.controller;

import com.autentia.restservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/albums")
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping()
    private String getAllAlbums() {
        return "Hola desde el AlbumController";
    }


}
