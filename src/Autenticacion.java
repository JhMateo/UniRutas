public class Autenticacion {
    public boolean autenticarUsuario(Usuario usuario, String nombreUsuario, String contrasena) {
        // TODO: Hashear contraseñas
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena);
    }
}

