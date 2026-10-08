package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionPostgres {
	
	private static final Logger log = LogManager.getLogger(ConexionPostgres.class);

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Angel");
			log.info("Conexion Exitosa");
		} catch (SQLException e) {
			log.error("Conexion Fallida", e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				log.error("Conexion Fallida", e.getMessage());
			}
		}

	}

}
