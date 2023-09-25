import java.util.List;

public class ServicioController {
    private Servicio servicio;
    public ServicioController(Ruta ruta, Sentido sentido) {
        servicio = new Servicio(ruta, sentido);
    }
    // TODO: Resolver errores :v
    public void asignarHorario(Horario horario) {
        this.servicio.añadirHorario(horario);
    }

    public void asignarBus(Bus bus) {
        servicio.añadirBus(bus);
    }

    public void removerHorario(Horario horario) {
        servicio.removerHorario(horario);
    }

    public void removerBus(Bus bus) {
        servicio.removerBus(bus);
    }

    public List<Bus> listarBuses() {
        return servicio.getBuses();
    }

    public List<Horario> listarHorarios() {
        return servicio.getHorarios();
    }

    public void añadirServicio(Servicio servicio) {
        // TODO:
    }

    public void eliminarServicio(Servicio servicio) {
        // TODO:
    }
}
