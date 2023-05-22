package fr.dawan.projetcompagnieaerienne.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class AeroportDto {
    
    
    
    private long idAeroport;
    
    private String codeIATA;
    
    private String nom;
    
    private String pays;

}
