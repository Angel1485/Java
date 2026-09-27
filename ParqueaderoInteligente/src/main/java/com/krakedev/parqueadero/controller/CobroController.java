package com.krakedev.parqueadero.controller;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.krakedev.parqueadero.model.TicketCobro;
import com.krakedev.parqueadero.service.ServicioCobro;

@RestController
@RequestMapping("/cobros")
public class CobroController {
	
	private final ServicioCobro servicioCobro;

    // Inyeccion por constructor
    public CobroController(ServicioCobro servicioCobro) {
        this.servicioCobro = servicioCobro;
    }

    @PostMapping("/procesar/{placa}/{horas}")
    public TicketCobro procesarSalida(
            @PathVariable String placa,
            @PathVariable int horas) {
        return servicioCobro.procesarSalida(placa, horas);
    }

    @GetMapping("/total")
    public HashMap<String, Double> totalRecaudado() {
        double total = servicioCobro.calcularTotalRecaudado();
        HashMap<String, Double> respuesta = new HashMap<>();
        respuesta.put("totalRecaudado", total);
        return respuesta;
    }

    @GetMapping("/historial")
    public List<TicketCobro> historial() {
        return servicioCobro.listarTickets();
    }

}
