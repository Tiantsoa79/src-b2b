package orange.mg.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends PanacheEntityBase {

    @Id
    @Column(name = "iduser")
    public Long iduser;

    @Column(name = "trigramme")
    public String trigramme;

    @Column(name = "nom")
    public String nom;

    @Column(name = "prenom")
    public String prenom;

    @Column(name = "mail")
    public String mail;

    @Column(name = "role")
    public String role;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roletodroit",
            joinColumns = @JoinColumn(name = "idrole"),
            inverseJoinColumns = @JoinColumn(name = "iddroit"))
    public List<DroitUser> droits;

    // Getters and setters
    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
