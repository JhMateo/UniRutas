import java.sql.SQLException;
import java.util.List;

public class RecorridoController {
    private Recorrido recorrido;
    public void agregarParadero(Paradero paradero, DatabaseManager dbManager) throws SQLException {
        recorrido.agregarParadero(paradero);
    }

    public void eliminarParadero(Paradero paradero){
        // TODO:
    }

    public void modificarParadero(Paradero paradero){
        // TODO:
    }

    public void asignarParaderos(List<Paradero> paraderos){
        // TODO:
    }

    public void crearTramo(List<Coordenada> coordenadas){
        // TODO: Implementa la lógica para crear un tramo con las coordenadas proporcionadas
        Tramo tramo = new Tramo(coordenadas);
        recorrido.agregarTramo(tramo);
    }

    public void eliminarTramo(Tramo tramo){
        // TODO:
    }

    public void asignarTramos(List<Tramo> tramos){
        // TODO:
    }

    public void eliminarTramos(List<Tramo> tramos){
        // TODO:
    }
}
