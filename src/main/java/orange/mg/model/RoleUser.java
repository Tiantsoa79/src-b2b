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
@Table(name = "role_user")
public class RoleUser extends PanacheEntity {

    @Column(name = "nom_role")
    public String nomRole;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "role_user_profils", joinColumns = @JoinColumn(name = "id_role"))
    @Column(name = "profil")
    public List<String> profils; // Utilisez une liste de chaînes pour stocker les profils

    // Getters and setters
    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    public List<String> getProfils() {
        return profils;
    }

    public void setProfils(List<String> profils) {
        this.profils = profils;
    }
}
