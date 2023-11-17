package com.mcService.microService.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class Servizio {

    private final RestTemplate restTemplate;

    public Servizio(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }




}
