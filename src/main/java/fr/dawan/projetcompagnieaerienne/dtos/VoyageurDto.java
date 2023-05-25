package fr.dawan.projetcompagnieaerienne.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class VoyageurDto {
    private long idVoyageur;
    private int numeroPlace;
    private String nomVoyageur;
    private String prenomVoyageur;
    private double prixPlace;

}
