public class Sentido {
    private String nombre;
    private Recorrido recorrido;

    public Sentido(String nombre, Recorrido recorrido) {
        this.nombre = nombre;
        this.recorrido = recorrido;
    }

    public String getNombre() {
        return nombre;
    }
}
