package com.autentia.restservice.service;

import com.autentia.restservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

}
