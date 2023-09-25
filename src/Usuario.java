import java.util.List;

public abstract class Usuario extends Persona {
    private String nombreUsuario;
    private String contrasena;
    private List<Alerta> alertasLeidas;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean cambiarContrasena(String nuevaContrasena){
        this.contrasena = nuevaContrasena;
        return true;

    public void marcarAlertaLeida(Alerta alerta) {
        alertasLeidas.add(alerta);
    }
}


