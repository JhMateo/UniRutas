import java.util.List;

public class Estudiante extends Usuario {
    private List<Servicio> suscripciones;

    public Estudiante(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    public void suscribirAServicio(Servicio servicio) {
        suscripciones.add(servicio);
    }

    @Override
    public void marcarAlertaLeida(Alerta alerta) {
        super.marcarAlertaLeida(alerta);
        System.out.println("El estudiante " + getNombreUsuario() + " ha marcado la alerta como leída. ");
        // Lógica específica para el estudiante
    }

    // Otros métodos y propiedades específicos de Estudiante
}
