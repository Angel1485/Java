package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectCliente {
	
	private static final Logger log = LogManager.getLogger(SelectCliente.class);

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps=  null;
		ResultSet rs = null; 

		try {
			con = Conexion.getConnection(); //llama al metodo directamente porque es static
			
			String sql = """ 
				 	     SELECT * FROM taller_estudiantes.clientes;
				         """;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();  
			
			while(rs.next()) { // Recuperamos los datos mientras existan
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int edad = rs.getInt("edad");
				
				log.info("Cedula: " + cedula + " Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad);
			}
			
		}catch(Exception e) {
			log.error("Error al listar", e.getMessage());
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
