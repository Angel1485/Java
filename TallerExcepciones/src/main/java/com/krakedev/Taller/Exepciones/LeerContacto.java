package com.krakedev.Taller.Exepciones;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {
	
    private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

	//public static void main(String[] args) {
    public static void leer() {
		
		BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader("contactos.txt"));

            String linea;
            // for para recorrer las líneas
            for (linea = lector.readLine(); linea != null; linea = lector.readLine()) {
            	log.info(linea);
            }

            log.info("Archivo contactos.txt leido correctamente.");

        } catch (FileNotFoundException e) {
            // Se ejecuta si el archivo NO existe
            log.error("Archivo no encontrado: {}", e.getMessage(), e);

        } catch (IOException e) {
            // Se ejecuta si hay error de lectura
            log.error("Error de E/S al leer el archivo.", e.getMessage(), e);

        } finally {
            if (lector != null) {
                try {
                    lector.close();
                    log.info("Lector cerrado correctamente");
                } catch (IOException e) {
                    log.error("Error al cerrar el lector", e.getMessage(), e);
                }
            }
        }

	}

}
