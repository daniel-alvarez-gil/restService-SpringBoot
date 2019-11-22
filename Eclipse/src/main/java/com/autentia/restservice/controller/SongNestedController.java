package com.autentia.restservice.controller;

import com.autentia.restservice.dto.SongPrinceOnly;
import com.autentia.restservice.model.Album;
import com.autentia.restservice.model.Artist;
import com.autentia.restservice.model.Song;
import com.autentia.restservice.service.ArtistService;
import com.autentia.restservice.service.SongService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artists/{artistId}/albums/{albumId}/songs")
public class SongNestedController {

    @Autowired
    ArtistService artistService;


}
