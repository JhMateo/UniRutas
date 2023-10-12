package main.java.com.unirutas.controllers;

import main.java.com.unirutas.models.Alerta;
import main.java.com.unirutas.models.Usuario;

import java.util.List;

public class AlertaController {
    public void notificarAlerta(Alerta alerta, List<Usuario> usuarios) {
        // Llama al método enviarAlerta de la alerta para notificar a los usuarios
        alerta.enviarAlerta(usuarios);
        System.out.println("main.java.com.unirutas.models.Alerta notificada a los usuarios.");
    }

    public void listarAlertas(List<Alerta> alertas) {
        System.out.println("Lista de Alertas:");
        for (Alerta alerta : alertas) {
            System.out.println("Fecha: " + alerta.getFecha());
            System.out.println("Descripción: " + alerta.getDescripcion());
            System.out.println("main.java.com.unirutas.models.Servicio: " + alerta.getServicio());
            System.out.println("------------------------");
        }
    }
}
