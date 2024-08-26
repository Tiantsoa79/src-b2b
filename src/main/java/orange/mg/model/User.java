package orange.mg.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.JoinColumn;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends PanacheEntity {

    @Column(name = "trigramme")
    public String trigramme;

    @Column(name = "nom")
    public String nom;

    @Column(name = "prenom")
    public String prenom;

    @Column(name = "mail")
    public String mail;

    @Column(name = "id_role")
    public Integer idRole;

    @Column(name = "role")
    public String role;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_droits", joinColumns = @JoinColumn(name = "id_user"))
    @Column(name = "droit")
    public List<String> droits; // Utilisez une liste de chaînes pour stocker les droits

    // Getters and setters
    public String getTrigramme() {
        return trigramme;
    }

    public void setTrigramme(String trigramme) {
        this.trigramme = trigramme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getDroits() {
        return droits;
    }

    public void setDroits(List<String> droits) {
        this.droits = droits;
    }
}
