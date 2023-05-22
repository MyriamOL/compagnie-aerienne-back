package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.dawan.projetcompagnieaerienne.entities.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{

    
    List<Utilisateur> findByNomUtilisateurLike(String model);
    
}
