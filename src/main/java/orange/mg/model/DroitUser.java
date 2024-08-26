package orange.mg.model;


import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "droit")
public class DroitUser extends PanacheEntityBase {

    @Id
    @Column(name = "iddroit")
    public Long iddroit;

    @Column(name = "nom")
    public String nom;


    // Getters and setters
    public Long getIddroit() {
        return iddroit;
    }

    public void setIddroit(Long iddroit) {
        this.iddroit = iddroit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
