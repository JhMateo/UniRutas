public abstract class Usuario extends Persona{
    private String nombreUsuario;
    private String contrasena;
    public Usuario(String nombre, int codigo, String nombreUsuario, String contrasena){
        super(nombre, codigo);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    public abstract void marcarAlertaLeida(Alerta alerta);
    public String getNombreUsuario(){
        return this.nombreUsuario;
    }
    public String getContrasena(){
        return this.contrasena;
    }
    public boolean cambiarContrasena(String nuevaContrasena){
        this.contrasena = nuevaContrasena;
        return true;
    }
}

