package miPrincipal;
import java.io.Serializable;

public class Estudiante implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private int edad;
    

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + edad;
    }
}





    

