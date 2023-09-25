public class GestorContrasenas {
    public boolean cambiarContrasena(Usuario usuario, String nuevaContrasena){
        usuario.cambiarContrasena(nuevaContrasena);
        return true;
    }
}
