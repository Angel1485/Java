package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteVehiculo {
	
	private static final Logger log = LogManager.getLogger(DeleteVehiculo.class);

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps=  null;

		try {
			con = Conexion.getConnection(); //llama al metodo directamente porque es static
			
	        String placa = "DEF456"; //Place del vehiculo para eliminar
			
			String sql = """ 
						 DELETE FROM public.vehiculos
						 WHERE placa=?;
				         """;
			ps = con.prepareStatement(sql);

			ps.setString(1, placa);

			int filas = ps.executeUpdate();
			
			if (filas > 0) {
                log.info("Vehiculo eliminado correctamente: {}", placa);
                log.info("Delete exitoso. Filas afectadas: " + filas);
            } else {
                log.error("No se elimino ningun vehiculo");
            }
			
		}catch(Exception e) {
			log.error("Error al Eliminar el Vehiculo", e.getMessage());
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
