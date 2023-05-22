package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Reservation;
import fr.dawan.projetcompagnieaerienne.entities.Voyageur;

public interface VoyageurRepository extends JpaRepository<Voyageur, Long> {
    
    List<Voyageur> findByNomVoyageurLike(String model);

}
