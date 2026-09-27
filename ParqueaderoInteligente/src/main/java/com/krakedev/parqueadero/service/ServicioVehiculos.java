package com.krakedev.parqueadero.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.krakedev.parqueadero.model.Vehiculo;

@Service
public class ServicioVehiculos {

	private ArrayList<Vehiculo> parqueadero = new ArrayList<>();
    private final int CAPACIDAD_MAXIMA = 10;

    //Buscar vehiculo por placa
    public Vehiculo buscarPorPlaca(String placa) {
        for (int i = 0; i < parqueadero.size(); i++) {
            Vehiculo v = parqueadero.get(i);
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    //Crea vehiculo
    public Vehiculo ingresarVehiculo(Vehiculo vehiculo) {
        if (parqueadero.size() >= CAPACIDAD_MAXIMA) {
            return null; // lleno
        }
        if (buscarPorPlaca(vehiculo.getPlaca()) != null) {
            return null; // placa duplicada
        }
        parqueadero.add(vehiculo);
        return vehiculo; // devuelve el objeto 
    }

    //Eliminar vehiculo
    public boolean retirarVehiculo(String placa) {
        Vehiculo v = buscarPorPlaca(placa);
        if (v == null) {
            return false;
        }
        parqueadero.remove(v);
        return true;
    }

    // Lista todos los vehiculos
    public ArrayList<Vehiculo> listarVehiculos() {
        return parqueadero;
    }
}
