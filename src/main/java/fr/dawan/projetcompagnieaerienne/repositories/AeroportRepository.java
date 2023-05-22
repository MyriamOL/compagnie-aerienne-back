package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Aeroport;


public interface AeroportRepository extends JpaRepository<Aeroport, Long> {
    List<Aeroport> findByNomLike(String model);
}
