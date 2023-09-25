import java.util.List;

public class AutenticacionController {
    // Constructor
    public AutenticacionController() {
        // Constructor de la clase AutenticacionController
    }

    // Método para autenticar un usuario
    public boolean autenticarUsuario(Usuario usuario, String nombreUsuario, String contrasena) {
        // Verificar si las credenciales coinciden con el usuario
        if (usuario != null && usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
            return true; // Credenciales válidas, autenticación exitosa
        } else {
            return false; // Credenciales inválidas, autenticación fallida
        }
    }
}


