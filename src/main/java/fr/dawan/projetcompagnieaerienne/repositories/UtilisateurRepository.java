package fr.dawan.projetcompagnieaerienne.repositories;

import java.util.List;
import java.util.Optional;


//Optional  => car retourne un utilisateur ou pas 
//permet de retourner null sans crasher l'application
import org.springframework.data.jpa.repository.JpaRepository;


import fr.dawan.projetcompagnieaerienne.entities.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{

    
    List<Utilisateur> findByNomUtilisateur(String model);
    Optional<Utilisateur>findByEmail(String model);
    
}
