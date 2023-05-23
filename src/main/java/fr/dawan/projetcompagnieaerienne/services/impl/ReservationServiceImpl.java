package fr.dawan.projetcompagnieaerienne.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.dawan.projetcompagnieaerienne.dtos.ReservationDto;
import fr.dawan.projetcompagnieaerienne.entities.Reservation;
import fr.dawan.projetcompagnieaerienne.repositories.ReservationRepository;
import fr.dawan.projetcompagnieaerienne.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
    
    @Autowired
    private ReservationRepository repository;
    @Autowired
    private ModelMapper mapper;
    
    @Override
    public List<ReservationDto> getAllReservation(Pageable page) {
        return repository.findAll(page).stream().map(m -> mapper.map(m, ReservationDto.class)).collect(Collectors.toList());
    }

   
    @Override
    public ReservationDto getReservationById(long id) {
        Reservation reservation = repository.findById(id).get();
        return mapper.map(reservation, ReservationDto.class);
    }
    
    
    
    @Override
    public boolean deleteReservation(long id) {
        boolean isExist = repository.existsById(id);
        if (isExist) {
            repository.deleteById(id);
        }
        return isExist;
    }
  
        @Override
        public ReservationDto saveOrUpdate(ReservationDto reservationDto) {
            Reservation r = mapper.map(reservationDto, Reservation.class);
            Reservation rr = repository.saveAndFlush(r);
            return mapper.map(rr, ReservationDto.class);
        }
    
}
