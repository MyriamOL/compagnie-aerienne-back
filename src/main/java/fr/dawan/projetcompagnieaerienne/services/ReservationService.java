package fr.dawan.projetcompagnieaerienne.services;

import java.util.List;

import fr.dawan.projetcompagnieaerienne.dtos.ReservationDto;

public interface ReservationService {
    
    List<ReservationDto>getAllReservation();
    ReservationDto getReservationById(long id);
    boolean deleteReservation(long id);
    ReservationDto saveOrUpdate(ReservationDto reservationDto);

}
