import java.util.List;

public class Conductor extends Persona {
    private List<Bus> conductores;

    public Conductor(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public List<Bus> getConductores() {
        return conductores;
    }

    public void asignarBus(Bus bus) {
        conductores.add(bus);
    }

    public void removerBus(Bus bus) {
        conductores.remove(bus);
    }
}
