import java.util.List;
public class Administrativo extends Usuario {

    // Constructor
    public Administrativo(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    public void marcarAlertaLeida(Alerta alerta) {
        System.out.println("El administrativo " + getNombreUsuario() + " ha marcado la alerta como leída. ");
    }
}

