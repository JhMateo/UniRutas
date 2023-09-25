import java.util.ArrayList;
import java.util.List;

// Clase BusService con responsabilidad sobre buses
public class BusService {
    private List<Bus> listadoBuses;

    public BusService() {
        this.listadoBuses = new ArrayList<>();
    }

    public void agregarBus(Bus bus) {
        listadoBuses.add(bus);
    }

    public void removerBus(Bus bus) {
        listadoBuses.remove(bus);
    }

    public List<Bus> getBuses() {
        return this.listadoBuses;
    }
}
