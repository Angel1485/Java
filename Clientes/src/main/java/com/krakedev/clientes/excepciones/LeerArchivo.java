package com.krakedev.clientes.excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerArchivo {
	
	private static final Logger log = LogManager.getLogger(LeerArchivo.class); //Debemos colocar el nombre de la clase
	
	public static void main(String[] args) {

		// "C:\\Users\\asarango\\Downloads\\Zabbix Manual.txt"
		try {
		    FileReader lectorArchivo = new FileReader("contacto.txt");
		    BufferedReader lector = new BufferedReader(lectorArchivo);
		    
		    //System.out.println(lector.readLine());
		    for(int i = 1; i <= 6 ; i++){
		    	log.info(lector.readLine());
		    }
		    
		    lector.close();
		    
		} catch (IOException e) {
		    //e.printStackTrace();
			log.error("Error ", e);
		}
	}

}
