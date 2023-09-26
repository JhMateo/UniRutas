public class AutenticacionController {
    public boolean autenticarUsuario(Usuario usuario, String nombreUsuario, String contrasena) {
        // Verificar si las credenciales coinciden con el usuario
        if (usuario != null && usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
            return true; // Credenciales válidas, autenticación exitosa
        } else {
            return false; // Credenciales inválidas, autenticación fallida
        }
    }
}
