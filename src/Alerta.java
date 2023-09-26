import java.util.Date;

public class Alerta {
    private Date fecha;
    private String descripcion;

    public Alerta(Date fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean enviarAlerta() {
        // TODO:
        // Aquí implementa la lógica para enviar la alerta
        // Puedes retornar true si se envió con éxito o false si no se pudo enviar.
        System.out.println("Alerta enviada: " + this.descripcion);
        return true; // Cambia esto según la implementación real.
    }
}
