package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Conexion {
	
	private static final Logger log = LogManager.getLogger(Conexion.class);
	private static final String URL = "jdbc:postgresql://localhost:5432/tallerjdbc"; //Nombre de la bd escojida
	private static final String USER = "postgres";  //Usuario General
	private static final String PASSWORD = "Angel"; //Contraseña General
	
	public static Connection getConnection() {
		
		try {
			Connection con =  DriverManager.getConnection(URL,USER,PASSWORD);
			log.info("Conexion Exitosa");
			return con;  //Retorno la conexion 
			
		} catch (SQLException e) {
			log.error("Conexion Fallida", e.getMessage());
			throw new RuntimeException("No se pudo hacer la conexion"); //Se propaga la conexion
		}
		
	}

}
