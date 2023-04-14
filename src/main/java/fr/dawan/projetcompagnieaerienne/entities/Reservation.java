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

@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Version
    private int version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private int idReservation;

    private double prix;
    @OneToMany(mappedBy = "reservation")
    List<Voyageur> voyageurs = new ArrayList<>();

    @ManyToOne(cascade=CascadeType.REMOVE)
    private Utilisateur utilisateur;

    public Reservation(int idReservation, double prix, Utilisateur utilisateur) {
        this.idReservation = idReservation;
        this.prix = prix;
        this.utilisateur = utilisateur;
    }

    public Reservation() {

    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public List<Voyageur> getVoyageurs() {
        return voyageurs;
    }

    public void setVoyageurs(List<Voyageur> voyageurs) {
        this.voyageurs = voyageurs;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

}
