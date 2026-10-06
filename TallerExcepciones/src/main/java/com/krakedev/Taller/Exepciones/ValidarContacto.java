package com.krakedev.Taller.Exepciones;

public class ValidarContacto {
	
	/**
     * Valida que el telefono tenga exactamente 10 digitos.
     * NO maneja la excepcion: la propaga con throws.
     */
    public static void validarTelefono(String telefono) throws IllegalArgumentException {

    											 //"Comodines"
        if (telefono == null || !telefono.matches("\\d{10}")) {
            throw new IllegalArgumentException(
                "El telefono debe tener exactamente 10 digitos. Recibido: " + telefono
            );
        }    
    }
}
