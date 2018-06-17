package py.com.gestion.bibliografia.model;

public class Materia {

    public Integer id;
    public Integer facultadId;
    public String nombre;
    public Integer bibliografiaId;

    public Materia() {
    }

    public Materia(Integer id, Integer facultadId, String nombre, Integer bibliografiaId) {
        this.id = id;
        this.facultadId = facultadId;
        this.nombre = nombre;
        this.bibliografiaId = bibliografiaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getBibliografiaId() {
        return bibliografiaId;
    }

    public void setBibliografiaId(Integer bibliografiaId) {
        this.bibliografiaId = bibliografiaId;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", facultadId=" + facultadId +
                ", nombre='" + nombre + '\'' +
                ", bibliografiaId=" + bibliografiaId +
                '}';
    }
}
