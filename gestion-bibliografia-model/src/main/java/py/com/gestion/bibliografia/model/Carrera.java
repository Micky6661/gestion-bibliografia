package py.com.gestion.bibliografia.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Carrera")
public class Carrera {

    public Integer id;
    public Integer facultadId;
    public String nombre;

    public Carrera() {
    }

    public Carrera(Integer id, Integer facultadId, String nombre) {
        this.id = id;
        this.facultadId = facultadId;
        this.nombre = nombre;
    }

    public Integer getCarreraId() {
        return id;
    }

    public void setCarreraId(Integer id) {
        this.id = id;
    }

    public Integer getFacultadId() {
        return facultadId;
    }

    public void setFacultadId(Integer facultadId) {
        this.facultadId = facultadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", facultadId=" + facultadId +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
