import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private List<Horario> listadoHorarios;
    private List<Bus> listadoBuses;
    private Ruta ruta;
    private List<Alerta> alertas = new ArrayList<>();
    public Servicio(Ruta ruta){
        this.ruta = ruta;
        this.listadoHorarios = new ArrayList<>();
        this.listadoBuses = new ArrayList<>();
    }
    public void agregarAlerta(Alerta alerta) {
        alertas.add(alerta);
    }
    public void notificarAlerta(Notificacion alerta) {
        boolean enviado = alerta.enviarAlerta();
        if (enviado) {
            System.out.println("Alerta notificada a los usuarios de la ruta.");
        } else {
            System.out.println("Error al notificar la alerta.");
        }
    }

    public void agregarHorario(Horario horario) {
        listadoHorarios.add(horario);
    }

    public void removerHorario(Horario horario) {
        listadoHorarios.remove(horario);
    }

    public List<Horario> getHorarios(){
        return this.listadoHorarios;
    }

    public void agregarBus(Bus bus) {
        listadoBuses.add(bus);
    }

    public void removerBus(Bus bus) {
        listadoBuses.remove(bus);
    }

    public List<Bus> getBuses(){
        return this.listadoBuses;
    }
}
