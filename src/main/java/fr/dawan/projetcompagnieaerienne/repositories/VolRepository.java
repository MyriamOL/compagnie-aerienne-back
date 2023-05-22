package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Reservation;
import fr.dawan.projetcompagnieaerienne.entities.Vol;

public interface VolRepository extends JpaRepository<Vol, Long> {
    
    List<Vol> findByNomLike(String model);
}
