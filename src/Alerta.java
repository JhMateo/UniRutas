import java.util.Date;

public class Alerta implements Notificacion {
    private Date fecha;
    private String descripcion;
    public Alerta(Date fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public boolean enviarAlerta(){
        // TODO: Añadir logica aqui
        System.out.println("Alerta enviada: " + this.descripcion);
        return true;
    }
}

