package com.krakedev.parqueadero.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.krakedev.parqueadero.model.Auto;
import com.krakedev.parqueadero.model.Motocicleta;
import com.krakedev.parqueadero.model.Vehiculo;
import com.krakedev.parqueadero.service.ServicioVehiculos;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
	
	private final ServicioVehiculos servicioVehiculos;

    // Inyeccion por constructor
    public VehiculoController(ServicioVehiculos servicioVehiculos) {
        this.servicioVehiculos = servicioVehiculos;
    }
 
    @PostMapping("/auto")
    public Auto ingresarAuto(@RequestBody Auto auto) {
        Vehiculo ingresado = servicioVehiculos.ingresarVehiculo(auto);
        if (ingresado == null) {
            return null;
        }
        return auto;
    }

    @PostMapping("/moto")
    public Motocicleta ingresarMoto(@RequestBody Motocicleta moto) {
        Vehiculo ingresado = servicioVehiculos.ingresarVehiculo(moto);
        if (ingresado == null) {
            return null;
        }
        return moto;
    }

    @GetMapping
    public List<Vehiculo> listar() {
        return servicioVehiculos.listarVehiculos();
    }

    @GetMapping("/{placa}")
    public Vehiculo buscarPorPlaca(@PathVariable String placa) {
        return servicioVehiculos.buscarPorPlaca(placa);
    }

}
