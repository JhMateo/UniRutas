import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int capacidad;
    private String placa;
    private List<Conductor> conductores;

    public Bus(int capacidad, String placa) {
        this.capacidad = capacidad;
        this.placa = placa;
        this.conductores = new ArrayList<>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void asignarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void removerConductor(Conductor conductor) {
        conductores.remove(conductor);
    }
}
