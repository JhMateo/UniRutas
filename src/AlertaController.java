public class AlertaController {
    public void notificarAlerta(Alerta alerta) {
        // TODO:
        boolean enviado = alerta.enviarAlerta();
        if (enviado) {
            System.out.println("Alerta notificada a los usuarios de la ruta.");
        } else {
            System.out.println("Error al notificar la alerta.");
        }
    }

    public void listarAlertas(Alerta alerta){
        // TODO:
    }
}
