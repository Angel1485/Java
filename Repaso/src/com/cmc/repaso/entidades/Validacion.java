package com.cmc.repaso.entidades;

public class Validacion {
    // Método solicitado
    public boolean validarMonto(double monto) {
        // Verifica si el monto es mayor a 0
        if (monto > 0) {
            return true;
        } else {
            return false;
        }
    }
}
