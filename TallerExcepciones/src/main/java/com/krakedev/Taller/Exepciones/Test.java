package com.krakedev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		
        //String telefono = "123"; // prueba invalida
        String telefono = "0981234567"; // prueba valida

        String nombre = "Andres";
        String apellido = "Duchitanga";

        try {
            // 1. Validar (puede lanzar IllegalArgumentException)
            ValidarContacto.validarTelefono(telefono);

            // 2. Si es valido, guardar
            GuardarContacto.guardar(nombre, apellido, telefono);

            // 3. Leer el archivo
            LeerContacto.leer();

            // 4. Todo salio bien
            log.info("Proceso completado exitosamente para {} {}", nombre, apellido);

        } catch (IllegalArgumentException e) {
            // Aqui se maneja la excepción que propago ValidarContacto
            log.error("Telefono invalido: {}", e.getMessage());
            log.error("No se guardó ningún contacto.");
        }
	
	}

}
