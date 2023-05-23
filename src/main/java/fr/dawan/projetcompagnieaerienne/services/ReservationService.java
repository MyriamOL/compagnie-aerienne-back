package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import fr.dawan.projetcompagnieaerienne.dtos.ReservationDto;

public interface ReservationService {
    
    List<ReservationDto>getAllReservation(Pageable page);
    ReservationDto getReservationById(long id);
    boolean deleteReservation(long id);
    ReservationDto saveOrUpdate(ReservationDto reservationDto);

}
