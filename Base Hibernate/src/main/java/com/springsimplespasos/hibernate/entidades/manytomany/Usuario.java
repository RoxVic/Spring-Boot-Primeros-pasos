package com.springsimplespasos.hibernate.entidades.manytomany;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(length = 20, unique = true, nullable = false)
    private String userName;

    @ManyToMany
    @JoinTable(name = "usuario_publicacion", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "publicacion_id"))
    private List<Publicaciones> publicaciones;

    public Usuario() {
    }

    public Usuario(Integer codigo, String userName) {
        this.codigo = codigo;
        this.userName = userName;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
