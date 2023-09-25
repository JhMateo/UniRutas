import java.util.ArrayList;
import java.util.List;

public class Paradero {
    private String nombre;
    private String descripcion;
    private Tramo tramoAnterior;
    private Tramo tramoSiguiente;
    private Coordenada coordenada;

    public Paradero(String nombre, String descripcion, Coordenada coordenada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.coordenada = coordenada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void asignarTramoAnterior(Tramo tramo) {
        this.tramoAnterior = tramo;
    }

    public void asignarTramoSiguiente(Tramo tramo) {
        this.tramoSiguiente = tramo;
    }

    // TODO: Se deja o no?
    public List<Double> getCoordenada() {
        return this.coordenada.getCoordenada();
    }
}
