import java.util.List;

public class ServicioController {
    private ServicioNew servicio;
    public ServicioController(Ruta ruta) {
        servicio = new ServicioNew(ruta);
    }
    public void agregarHorario(Horario horario) {
        servicio.getHorarioService().agregarHorario(horario);
    }
    public void removerHorario(Horario horario) {
        servicio.getHorarioService().removerHorario(horario);
    }
    public List<Horario> getHorarios() {
        return servicio.getHorarioService().getHorarios();
    }
    public void agregarBus(Bus bus) {
        servicio.getBusService().agregarBus(bus);
    }
    public void removerBus(Bus bus) {
        servicio.getBusService().removerBus(bus);
    }
    public List<Bus> getBuses() {
        return servicio.getBusService().getBuses();
    }

    public void agregarAlerta(Alerta alerta) {
        servicio.getAlertaService().agregarAlerta(alerta);
    }

    public void notificarAlerta(Notificacion alerta) {
        servicio.getAlertaService().notificarAlerta(alerta);
    }
}
