package fr.dawan.projetcompagnieaerienne.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.projetcompagnieaerienne.dtos.ReservationDto;
import fr.dawan.projetcompagnieaerienne.services.ReservationService;


@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    //La liste des reservations
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReservationDto> getAll(Pageable page) {
        return reservationService.getAllReservation(page);
    }
    //supprimer une reservations
    @DeleteMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> deleteReservation(@PathVariable long id){
        if (!reservationService.deleteReservation(id)) {
            return new ResponseEntity<>("la reservation"+id+"n'existe pas", HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>("La reservation"+id+ "est supprimée",HttpStatus.OK);
        }
    }
  //Ajouter une reservations
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReservationDto addMarque(@RequestBody ReservationDto reservationDto) {
        return reservationService.saveOrUpdate(reservationDto);
    }
    
    
    
    
}
