package fr.dawan.projetcompagnieaerienne.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.projetcompagnieaerienne.dtos.ReservationDto;
import fr.dawan.projetcompagnieaerienne.services.ReservationService;


@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReservationDto> getAll(Pageable page) {
        return reservationService.getAllReservation(page);
    }

 
    
    
    
    
}
