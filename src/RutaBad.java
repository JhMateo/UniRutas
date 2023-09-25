public class RutaBad {
    private String nombre;
    private Recorrido recorrido;

    public RutaBad(String nombre, Recorrido recorrido) {
        this.nombre = nombre;
        this.recorrido = recorrido;
    }

    public String getNombre() {
        return nombre;
    }
    public static RutaBad crearRuta(String nombre, Recorrido recorrido) {
        return new RutaBad(nombre, recorrido);
    }
}
