public class UsuarioBad extends Persona{
    private String nombreUsuario;
    private String contrasena;
    public UsuarioBad(String nombre, int codigo, String nombreUsuario, String contrasena) {
        super(nombre, codigo);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public boolean autenticar(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    public void setContrasena(String nuevaContrasena){

    }
}


