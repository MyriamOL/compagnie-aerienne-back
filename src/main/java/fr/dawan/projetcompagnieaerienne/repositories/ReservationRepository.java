package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

   // List<Reservation> findByNomLike(String model);
    
}
