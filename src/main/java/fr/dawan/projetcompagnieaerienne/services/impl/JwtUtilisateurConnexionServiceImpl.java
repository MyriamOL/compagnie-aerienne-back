package fr.dawan.projetcompagnieaerienne.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.dawan.projetcompagnieaerienne.repositories.UtilisateurRepository;


//Etape 3 

// Cette class detient une methode qui verifie  si l'utilisateur est enregistre sur la Bdd si il n'y a pas alors generera une exception 
//UserDetailService est une entité deja créée par spring 
//On va ajouter les 3 dependances dans le pom xml     voir a partir de <!-- jwt-->
@Service
public class JwtUtilisateurConnexionServiceImpl implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return utilisateurRepository.findByEmail(email)
              .orElseThrow(()-> new UsernameNotFoundException("user not found"));

    }
    

    
    
}
