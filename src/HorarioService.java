import java.util.ArrayList;
import java.util.List;

// Clase HorarioService con responsabilidad sobre horarios
public class HorarioService {
    private List<Horario> listadoHorarios;

    public HorarioService() {
        this.listadoHorarios = new ArrayList<>();
    }

    public void agregarHorario(Horario horario) {
        listadoHorarios.add(horario);
    }

    public void removerHorario(Horario horario) {
        listadoHorarios.remove(horario);
    }

    public List<Horario> getHorarios() {
        return this.listadoHorarios;
    }
}
