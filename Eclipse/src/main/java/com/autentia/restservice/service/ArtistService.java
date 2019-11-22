package com.autentia.restservice.service;

import com.autentia.restservice.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

}