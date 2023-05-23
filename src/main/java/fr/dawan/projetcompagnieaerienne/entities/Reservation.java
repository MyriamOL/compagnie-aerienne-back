package fr.dawan.projetcompagnieaerienne.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude; 

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Version
    private int version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private long idReservation;
    
    @Column(name = "numero_vol")
    private String numeroVol;
    
    @Column(name = "aeroport_depart")
    private String aeroportDepart;
    
    @Column(name = "aeroport_arrivee")
    private String aeroportArrivee;
    
    
    @Column(name = "date_depart")
    private String dateDepart;
    
    @Column(name = "date_arrivee")
    private String dateArrivee;
    
    

    private double prix;
    @OneToMany(mappedBy = "reservation")
    @Exclude
    
    List<Voyageur> voyageurs = new ArrayList<>();

    @ManyToOne(cascade=CascadeType.REMOVE)
    @Exclude
    private Utilisateur utilisateur;

    public Reservation(long idReservation, String numeroVol, String aeroportDepart, String aeroportArrivee,
            String dateDepart, String dateArrivee, double prix, Utilisateur utilisateur) {
        this.idReservation = idReservation;
        this.numeroVol = numeroVol;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.prix = prix;
        this.utilisateur = utilisateur;
    }

//    public Reservation(long idReservation, double prix, Utilisateur utilisateur) {
//        this.idReservation = idReservation;
//        this.prix = prix;
//        this.utilisateur = utilisateur;
//        this.
//    }

    
   

}
