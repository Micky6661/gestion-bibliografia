package py.com.gestion.bibliografia.model;

public class Libro {

    public Integer id;
    public String nombre;
    public Integer editorialId;
    public Integer autorId;
    public Integer editorial;

    public Libro() {
    }

    public Libro(Integer id, String nombre, Integer editorialId, Integer autorId, Integer editorial) {
        this.id = id;
        this.nombre = nombre;
        this.editorialId = editorialId;
        this.autorId = autorId;
        this.editorial = editorial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEditorialId() {
        return editorialId;
    }

    public void setEditorialId(Integer editorialId) {
        this.editorialId = editorialId;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public Integer getEditorial() {
        return editorial;
    }

    public void setEditorial(Integer editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", editorialId=" + editorialId +
                ", autorId=" + autorId +
                ", editorial=" + editorial +
                '}';
    }
}

