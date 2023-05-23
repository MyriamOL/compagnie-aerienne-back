package fr.dawan.projetcompagnieaerienne.dtos;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReservationDto {
    
  
    private long idReservation;
    private String aeroportArrivee;
    private String dateDepart;
    private double prix;
    private String aeroportDepart;
    
  

}
