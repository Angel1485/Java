package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateCliente {

	private static final Logger log = LogManager.getLogger(UpdateCliente.class);

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps=  null;

		try {
			con = Conexion.getConnection(); //llama al metodo directamente porque es static
			
			String sql = """ 
						UPDATE taller_estudiantes.clientes
						SET nombre=?, apellido=?, edad=?
						WHERE cedula=?;
				         """;
			ps = con.prepareStatement(sql);

			ps.setString(1, "Angel Iva0n");
			ps.setString(2, "Sanchez Sarango");
			ps.setInt(3, 30);
			ps.setString(4, "1234555889");

			int filas = ps.executeUpdate();
			
			log.info("Filas actualziadas: " + filas);
			
		}catch(Exception e) {
			log.error("Error al Actualizar", e.getMessage());
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
