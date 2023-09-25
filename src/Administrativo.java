public class Administrativo extends Usuario{
    public Administrativo(String nombre, int codigo, String nombreUsuario, String contrasena) {
        super(nombre, codigo, nombreUsuario, contrasena);
    }
    @Override
    public void marcarAlertaLeida(Alerta alerta) {
        System.out.println("El administrativo " + getNombreUsuario() + " ha marcado la alerta como leída. ");
    }
}

