import java.util.List;

public class ServicioNew {
    private HorarioService horarioService;
    private BusService busService;
    private AlertaService alertaService;
    private Ruta ruta;
    public ServicioNew(Ruta ruta) {
        this.ruta = ruta;
        this.horarioService = new HorarioService();
        this.busService = new BusService();
        this.alertaService = new AlertaService();
    }
    public HorarioService getHorarioService() {
        return horarioService;
    }
    public BusService getBusService() {
        return busService;
    }
    public AlertaService getAlertaService() {
        return alertaService;
    }
}

