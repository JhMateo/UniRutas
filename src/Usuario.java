
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario extends Persona {
    private String nombreUsuario;
    private String contrasena;
    private List<Alerta> alertasLeidas;

    public Usuario(String nombre, String codigo, String nombreUsuario, String contrasena){
        super(nombre, codigo);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.alertasLeidas = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
        return true;
    }

    public void marcarAlertaLeida(Alerta alerta) {
        alertasLeidas.add(alerta);
    }
}


