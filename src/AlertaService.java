import java.util.ArrayList;
import java.util.List;

// Clase AlertaService con responsabilidad sobre alertas
public class AlertaService {
    private List<Alerta> alertas;

    public AlertaService() {
        this.alertas = new ArrayList<>();
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
}
