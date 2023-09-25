import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int capacidad;
    private String placa;
    private List<Conductor> listadoConductor;

    public Bus(int capacidad, String placa) {
        this.capacidad = capacidad;
        this.placa = placa;
        this.listadoConductor = new ArrayList<>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void asignarConductor(Conductor conductor) {
        listadoConductor.add(conductor);
    }
}
