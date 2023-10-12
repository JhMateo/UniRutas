package main.java.com.unirutas.models;

import java.util.ArrayList;
import java.util.List;

public class Coordenada {
    private double latitud;
    private double longitud;

    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public List<Double> getCoordenada() {
        List<Double> coordenadas = new ArrayList<>();
        coordenadas.add(this.latitud);
        coordenadas.add(this.longitud);
        return coordenadas;
    }
}
