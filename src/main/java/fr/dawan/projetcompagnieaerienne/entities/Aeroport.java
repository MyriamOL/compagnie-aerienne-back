package fr.dawan.projetcompagnieaerienne.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="aeroports")
public class Aeroport implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_aeroport")
    private long idAeroport;
    
    @Column(name="code_IATA", nullable=false, length=3)
    private String codeIATA;
    
    private String nom;
    
    private String pays;

    
    //constructeurs
    public Aeroport(String nom, String codeIATA, String pays) {
        this.nom = nom;
        this.codeIATA = codeIATA;
        this.pays = pays;
    }

    public Aeroport() {
        
    }

    
    //getters & setters
    public long getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(long idAeroport) {
        this.idAeroport = idAeroport;
    }

    public String getCodeIATA() {
        return codeIATA;
    }

    public void setCodeIATA(String codeIATA) {
        this.codeIATA = codeIATA;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
    

}
