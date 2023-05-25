package fr.dawan.projetcompagnieaerienne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.projetcompagnieaerienne.services.AeroportService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/aeroports")
public class AeroportController {

    @Autowired
    private AeroportService service;
    
    @GetMapping()
    public
}
