package com.krakedev.Taller.Exepciones;
import java.io.FileWriter;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

	//public static void main(String[] args) {
	public static void guardar(String nombre, String apellido, String telefono) {
		
		FileWriter escritor = null;

	        try {

	   		    escritor = new FileWriter("contactos.txt", true);
	   		    
//	            escritor.write("Nombre:" + " Angel\n");
//	            escritor.write("Apellido: " + "Sarango\n");
//	            escritor.write("Telefono: " + "0980475599\n");
//	            escritor.write("-----\n");
	   		    
	   		    escritor.write("Nombre: " + nombre + "\n");
	            escritor.write("Apellido: " + apellido + "\n");
	            escritor.write("Telefono: " + telefono + "\n");
	            escritor.write("-----\n");
	   		    
	   		    
	            log.info("Contacto guardado exitosamente");

	        } catch (IOException e) {
	            log.error("Error al guardar el contacto:", e.getMessage());

	        } finally {
	        	
	            if (escritor != null) {
	                try {
	                    escritor.close();
	                    log.info("Archivo cerrado correctamente.");
	                } catch (IOException e) {
	                    log.error("Error al cerrar el archivo", e.getMessage());
	                }
	            }
	        	
	        }
	}

}
