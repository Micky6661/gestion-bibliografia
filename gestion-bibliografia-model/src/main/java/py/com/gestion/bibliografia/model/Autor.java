package py.com.gestion.bibliografia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @Column(name = "id")
    public Integer id;

    @Column(name = "nacionalidad_id")
    public Integer nacionalidadId;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "direccion")
    public String direccion;

    @Column(name = "telefono")
    public String telefono;

    public Autor() {
    }

    public Autor(Integer id, Integer nacionalidadId, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nacionalidadId = nacionalidadId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getAutorId() {
        return id;
    }

    public void setAutorId(Integer id) {
        this.id = id;
    }

    public Integer getNacionalidadId() {
        return nacionalidadId;
    }

    public void setNacionalidadId(Integer nacionalidadId) {
        this.nacionalidadId = nacionalidadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nacionalidadId=" + nacionalidadId +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
