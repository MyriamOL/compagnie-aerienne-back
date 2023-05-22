package fr.dawan.projetcompagnieaerienne.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="voyageurs")
public class Voyageur implements Serializable  {
    
    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_voyageur")
    private long idVoyageur;
    
    @Column(name="numero_place",nullable=false)
    private int numeroPlace;
    
    @Column(name="nom_voyageur")
    private String nomVoyageur;
    
    @Column(name="prenom_voyageur")
    private String prenomVoyageur;
    
    @Column(name="prix_place")
    private double prixPlace;
    
    @ManyToOne(cascade=CascadeType.REMOVE)
    private Reservation reservation;
    
    @ManyToOne(cascade=CascadeType.REMOVE)
    private Vol vol;

    
    
    public Voyageur(long idVoyageur, int numeroPlace, String nomVoyageur, String prenomVoyageur, double prixPlace,
            Reservation reservation, Vol vol) {
        this.idVoyageur = idVoyageur;
        this.numeroPlace = numeroPlace;
        this.nomVoyageur = nomVoyageur;
        this.prenomVoyageur = prenomVoyageur;
        this.prixPlace = prixPlace;
        this.reservation = reservation;
        this.vol = vol;
    }

    public Voyageur() {
        
    }

    
    
    public long getIdVoyageur() {
        return idVoyageur;
    }

    public void setIdVoyageur(long idVoyageur) {
        this.idVoyageur = idVoyageur;
    }

    public int getNumeroPlace() {
        return numeroPlace;
    }

    public void setNumeroPlace(int numeroPlace) {
        this.numeroPlace = numeroPlace;
    }

    public String getNomVoyageur() {
        return nomVoyageur;
    }

    public void setNomVoyageur(String nomVoyageur) {
        this.nomVoyageur = nomVoyageur;
    }

    public String getPrenomVoyageur() {
        return prenomVoyageur;
    }

    public void setPrenomVoyageur(String prenomVoyageur) {
        this.prenomVoyageur = prenomVoyageur;
    }

    public double getPrixPlace() {
        return prixPlace;
    }

    public void setPrixPlace(double prixPlace) {
        this.prixPlace = prixPlace;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }
    

}
