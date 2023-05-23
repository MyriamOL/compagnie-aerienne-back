package fr.dawan.projetcompagnieaerienne.security;


// Sur postman jai enregistre  des données en Json ( email et un mdp avec url localhost:8080/api/utilisateurs en POST)
//
//Etape 1
//Entrée utilisateur email et mdp
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JwtRequestUtilisateurConnexion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String email;
    
    private String mdp;

    
    
}
