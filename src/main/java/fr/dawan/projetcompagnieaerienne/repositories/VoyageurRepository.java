package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Voyageur;

public interface VoyageurRepository extends JpaRepository<Voyageur, Integer> {

    List<Voyageur> findByNombreAeroportGreaterThan(int nbVoyageur);
}
