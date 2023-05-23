package fr.dawan.projetcompagnieaerienne.security;
 

//Etape 2
//Reponse qui va être renvoyé 
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class JwtReponseUtilisateurConnexion implements Serializable {
    private static final long serialVersionUID = 1L;

   
    private String jwtToken;

}
