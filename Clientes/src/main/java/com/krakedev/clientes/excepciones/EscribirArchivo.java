package com.krakedev.clientes.excepciones;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.krakedev.clientes.tryCatch.EjemploExcepcion;

public class EscribirArchivo {

	private static final Logger log = LogManager.getLogger(EscribirArchivo.class); //Debemos colocar el nombre de la clase
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter escritor = new FileWriter("contacto.txt", true);  //Para que no se sobreescriba se coloca true
			
			escritor.write("Carlos\n");
		    escritor.write("Sarango\n");
		    escritor.write("12347890\n");
		    
		    escritor.close();
		    log.info("Archivo creado con exito");
			
		} catch (IOException e) {
			 log.error("Ocurrio un error", e.getMessage());
		}

	}

}
