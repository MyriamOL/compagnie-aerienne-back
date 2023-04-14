package fr.dawan.projetcompagnieaerienne.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="vols")
public class Vol implements Serializable{

    private static final long serialVersionUID = 1L;

    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_vol")
    private int idVol;
    
    @Column(name="date_depart",nullable=false)
    private LocalDateTime dateDepart;
    
    @Column(name="date_arrivee")
    private LocalDateTime dateArrivee;
    
    @Column(name="nombre_places_max")
    private int nombrePlacesMax;
    
    @JoinColumn(name="aeroport_arrivee",nullable=false)
    @ManyToOne(cascade=CascadeType.REMOVE)
    private Aeroport aeroportArrivee;
    
    @JoinColumn(name="aeroport_depart",nullable=false)
    @ManyToOne(cascade=CascadeType.REMOVE)
    private Aeroport aeroportDepart;
    
    @OneToMany(mappedBy="vol")
    private List<Voyageur> voyageurs = new ArrayList<Voyageur>();

    
    
    
    public Vol(int idVol, LocalDateTime dateDepart, LocalDateTime dateArrivee, int nombrePlacesMax, Aeroport aeroportArrivee, Aeroport aeroportDepart, List<Voyageur> voyageurs) {
        this.idVol = idVol;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.nombrePlacesMax = nombrePlacesMax;
        this.aeroportArrivee = aeroportArrivee;
        this.aeroportDepart = aeroportDepart;
        this.voyageurs = voyageurs;
    }

    public Vol() {
        
    }

    
    
    public int getIdVol() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }

    public LocalDateTime getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDateTime dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalDateTime getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDateTime dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public int getNombrePlacesMax() {
        return nombrePlacesMax;
    }

    public void setNombrePlacesMax(int nombrePlacesMax) {
        this.nombrePlacesMax = nombrePlacesMax;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public List<Voyageur> getVoyageurs() {
        return voyageurs;
    }

    public void setVoyageurs(List<Voyageur> voyageurs) {
        this.voyageurs = voyageurs;
    }
    
    
    
}
