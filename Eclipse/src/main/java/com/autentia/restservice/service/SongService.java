package com.autentia.restservice.service;

import com.autentia.restservice.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService{

    @Autowired
    SongRepository songRepository;

}