package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateVehiculo {
	
	private static final Logger log = LogManager.getLogger(UpdateVehiculo.class);

	public static void main(String[] args) {
	
		Connection con = null;
		PreparedStatement ps=  null;

		try {
			con = Conexion.getConnection(); //llama al metodo directamente porque es static
			
			//Placa del vehiculo que vamos a actualizar debe existir
	        String placa = "ABC123";

	        //Nuevos datos
	        String nuevaMarca = "Toyota";
	        String nuevoModelo = "Corolla Sport";
	        int nuevoAnio = 2023;
	        double nuevoPrecio = 21000.00;
	        String nuevoColor = "Blanco";
	        boolean nuevaDisponibilidad = false;
			
			String sql = """ 
						 UPDATE public.vehiculos
						 SET marca=?, modelo=?, anio=?, precio=?, color=?, disponible=?
						 WHERE placa=?;
				         """;
			ps = con.prepareStatement(sql);

			ps.setString(1, nuevaMarca);
            ps.setString(2, nuevoModelo);
            ps.setInt(3, nuevoAnio);
            ps.setDouble(4, nuevoPrecio);
            ps.setString(5, nuevoColor);
            ps.setBoolean(6, nuevaDisponibilidad);
            ps.setString(7, placa);

			int filas = ps.executeUpdate();
			
			if (filas > 0) {
                log.info("Vehiculo actuañizado correctamente: {}", placa);
                log.info("Update exitoso. Filas afectadas: " + filas);
            } else {
                log.error("No se inserto ningun vehiculo");
            }
			
		}catch(Exception e) {
			log.error("Error al Actualizar el Vehiculo", e.getMessage());
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
