package com.mcService.microService.controller;

import com.mcService.microService.service.Servizio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/scemo")
public class ProductoController {
    @Autowired
    private Servizio riposi;

    private final RestTemplate restTemplate;

    public ProductoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("")
    public String eseguiChiamataRest() {
        String url = "http://localhost:8084/api";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response.getBody() + "  terzo";
    }
}
