package fr.dawan.projetcompagnieaerienne.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="utilisateurs")
public class Utilisateur implements Serializable{
    
private static final long serialVersionUID = 1L;
    
    @Version
    private int version;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_utilisateur")
    private int idUtilisateur;
    
    @Column(name="nom_utilisateur")
    private String nomUtilisateur;
    
    @Column(name="prenom_utilisateur")
    private String prenomUtilisateur;
    
    @Column(name="email")
    private String email;
    
    @Column(name="mot_de_passe")
    private String motDePasse;

    
    //constructeurs
    public Utilisateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Utilisateur() {
        
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    
    //getters & setters
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nomUtilisateur;
    }

    public void setNom(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenom() {
        return prenomUtilisateur;
    }

    public void setPrenom(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    
}
