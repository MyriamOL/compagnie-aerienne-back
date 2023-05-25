package fr.dawan.projetcompagnieaerienne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.projetcompagnieaerienne.entities.Vol;

public interface VolRepository extends JpaRepository<Vol, Long> {
    // par rapport prix
    // List<Vol> findByNomLike(String model);
}
