import java.util.List;

public class Persona {
    private String nombre;
    private int codigo;

    public Persona(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Otras operaciones y métodos relevantes para Persona según sus relaciones en el diagrama
}

