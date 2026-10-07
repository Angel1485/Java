package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.entidades.Vehiculo;

public class SelectVehiculo {
	
	private static final Logger log = LogManager.getLogger(SelectVehiculo.class);

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps=  null;
		ResultSet rs = null; 

		try {
			con = Conexion.getConnection(); //llama al metodo directamente porque es static
			
			String sql = """ 
				 	     SELECT placa, marca, modelo, anio, precio, color, disponible
						 FROM public.vehiculos;
				         """;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) { // Recuperamos los datos mientras existan
				
				Vehiculo v = new Vehiculo();
                
				v.setPlaca(rs.getString("placa"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setAnio(rs.getInt("anio"));
                v.setPrecio(rs.getDouble("precio"));
                v.setColor(rs.getString("color"));
                v.setDisponible(rs.getBoolean("disponible"));
				
				log.info("Placa: " + v.getPlaca() + " Marca: " + v.getMarca() + " Modelo: " + v.getModelo() + " Año: " + v.getAnio() +
				         " Precio: " + v.getPrecio() + " Color: " + v.getColor()+ " Disponible: " + v.isDisponible());
			}
			
		}catch(Exception e) {
			log.error("Error al listar los vehiculos", e.getMessage());
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
