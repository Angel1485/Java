package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertCliente {
	
	private static final Logger log = LogManager.getLogger(InsertCliente.class);
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String BD = "postgres";
	private static final String PASSWORD = "Angel";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps;
		
		String sql = """ 
					 INSERT INTO taller_estudiantes.clientes
				     (cedula, nombre, apellido, edad)
					  VALUES(?,?,?,?);
					 """;
		
		try {
			con = DriverManager.getConnection(URL,BD,PASSWORD);
			log.info("Conexion Exitosa");
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "1234555889");
			ps.setString(2, "Justin Andres");
			ps.setString(3, "Sarango D.");
			ps.setInt(4, 25);
			
			int filas = ps.executeUpdate();
			log.info("Filas Insertadas: " + filas);

		} catch (SQLException e) {
			log.error("Conexion Fallida" , e.getMessage());
		}finally {
			try {
				con.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Conexion Fallida Finally", e.getMessage());
			}
		}

	}

}
