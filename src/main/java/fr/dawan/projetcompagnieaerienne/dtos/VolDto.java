package fr.dawan.projetcompagnieaerienne.dtos;

import java.time.LocalDateTime;

import fr.dawan.projetcompagnieaerienne.entities.Aeroport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class VolDto {
    
    private long idVol;
    private LocalDateTime dateDepart;
    private LocalDateTime dateArrivee;
    private int nombrePlacesMax;
    private Aeroport aeroportArrivee;
    private Aeroport aeroportDepart;
}
