public class Estudiante extends Usuario{
    public Estudiante(String nombre, int codigo, String nombreUsuario, String contrasena) {
        super(nombre, codigo, nombreUsuario, contrasena);
    }
    @Override
    public void marcarAlertaLeida(Alerta alerta) {
        System.out.println("El estudiante " + getNombreUsuario() + " ha marcado la alerta como leída. ");
    }
    public void suscribirARuta(Ruta ruta){
        // TODO: code here
    }
}
