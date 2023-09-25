import java.util.List;

public class Estudiante extends Usuario {
    private List<Servicio> suscripciones;

    public Estudiante(String nombre, int codigo, String nombreUsuario, String contrasena){
        super(nombre, codigo, nombreUsuario, contrasena);
    }

    public void suscribirAServicio(Servicio servicio) {
        suscripciones.add(servicio);
    }
}
