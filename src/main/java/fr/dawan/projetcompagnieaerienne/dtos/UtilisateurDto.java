package fr.dawan.projetcompagnieaerienne.dtos;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UtilisateurDto {
    
  
    private long idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String email;
    private String motDePasse;

}
