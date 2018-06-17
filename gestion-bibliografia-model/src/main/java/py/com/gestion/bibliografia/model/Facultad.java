package py.com.gestion.bibliografia.model;

public class Facultad {

    public Integer id;
    public String nombre;
    public String alias;

    public Facultad() {
    }

    public Facultad(Integer id, String nombre, String alias) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "facultadId=" + id +
                ", nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
