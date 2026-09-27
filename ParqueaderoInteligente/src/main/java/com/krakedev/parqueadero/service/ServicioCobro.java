package com.krakedev.parqueadero.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.krakedev.parqueadero.model.TicketCobro;
import com.krakedev.parqueadero.model.Vehiculo;

@Service
public class ServicioCobro {
	
    private final ServicioVehiculos servicioVehiculos;
    private ArrayList<TicketCobro> historicoTickets = new ArrayList<>();

    // Inyeccion por constructor
    public ServicioCobro(ServicioVehiculos servicioVehiculos) {
        this.servicioVehiculos = servicioVehiculos;
    }

    public TicketCobro procesarSalida(String placa, int horas) {

        Vehiculo vehiculo = servicioVehiculos.buscarPorPlaca(placa);

        if (vehiculo == null) {
            return null;
        }

        // Hereda del padre (Vehiculo)
        double total = vehiculo.calcularTarifa(horas);

        // Retiramos del parqueadero
        boolean retirado = servicioVehiculos.retirarVehiculo(placa);
        if (!retirado) {
            return null;
        }

        // Codigo de ticket aleatorio
        String codigo = "TCK-" + (int) (Math.random() * 900 + 100);

        TicketCobro ticket = new TicketCobro(codigo, vehiculo, horas, total);
        historicoTickets.add(ticket);

        return ticket;
    }

    //calcula el total
    public double calcularTotalRecaudado() {
        double total = 0;
        for (int i = 0; i < historicoTickets.size(); i++) {
            total += historicoTickets.get(i).getTotalPagar();
        }
        return total;
    }

    //Lista el hsitorial
    public ArrayList<TicketCobro> listarTickets() {
        return historicoTickets;
    }

}
