package orange.mg.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "droit_user") // Assurez-vous que le nom de la table correspond à votre base de données
public class DroitUser extends PanacheEntity {

    @Column(name = "nom_droit")
    public String nomDroit;

    public String getNomDroit() {
        return nomDroit;
    }

    public void setNomDroit(String nomDroit) {
        this.nomDroit = nomDroit;
    }
}
