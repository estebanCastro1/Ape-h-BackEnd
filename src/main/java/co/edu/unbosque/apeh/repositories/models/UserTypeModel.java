package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;

@Entity
@Table(name = "userType")
public class UserTypeModel {

    @Id
    private String id;
    @Column(nullable = false)
    private String tipoUsuario;

    @OneToOne(mappedBy = "userType")
    private UserModel user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
