import java.util.ArrayList;
import java.util.List;

public class Recorrido {
    private Direccion direccion;
    private List<Paradero> listadoParaderos;
    private List<Tramo> listadoTramos;

    public Recorrido(List<Paradero> listadoParaderos, List<Tramo> listadoTramos){
        this.listadoParaderos = listadoParaderos;
        this.listadoTramos = listadoTramos;
    }

    public void asignarDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void agregarParadero(Paradero paradero) {
        listadoParaderos.add(paradero);
    }

    public void agregarTramo(Tramo tramo) {
        listadoTramos.add(tramo);
    }

    public void removerParadero(Paradero paradero) {
        listadoParaderos.remove(paradero);
    }

    public void removerTramo(Tramo tramo) {
        listadoTramos.remove(tramo);
    }
}
