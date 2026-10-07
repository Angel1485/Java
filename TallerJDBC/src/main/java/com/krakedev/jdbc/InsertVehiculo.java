package com.krakedev.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.krakedev.entidades.Vehiculo;

public class InsertVehiculo {
	
	private static final Logger log = LoggerFactory.getLogger(InsertVehiculo.class);

    public static void main(String[] args) {

        // 1. Creamos el vehiculo a insertar
        Vehiculo vehiculo = new Vehiculo("ABC700", "Toyota", "Corolla", 2020, 18500.50, "Rojo", true);
        
        //Vehiculos de Pruebas
        //Vehiculo vehiculo1 = new Vehiculo("XYZ789", "Mazda", "CX-5", 2022, 27000.00, "Azul", true);    
        //Vehiculo vehiculo = new Vehiculo("DEF456", "Chevrolet", "Aveo", 2018, 9500.75, "Negro", false);

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            // 2. Obtenemos la conexion
            connection = Conexion.getConnection();

            // 3. Preparamos el SQL con parametros ?
            String sql = """
	            		INSERT INTO public.vehiculos
						(placa, marca, modelo, anio, precio, color, disponible)
						VALUES(?, ?, ?, ?, ?, ?, ?);
            		    """;

            ps = connection.prepareStatement(sql);

            // 4. Seteamos los parámetros
            ps.setString(1, vehiculo.getPlaca());
            ps.setString(2, vehiculo.getMarca());
            ps.setString(3, vehiculo.getModelo());
            ps.setInt(4, vehiculo.getAnio());
            ps.setDouble(5, vehiculo.getPrecio());
            ps.setString(6, vehiculo.getColor());
            ps.setBoolean(7, vehiculo.isDisponible());

            // 5. Ejecutamos
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                log.info("Vehiculo insertado correctamente: {}", vehiculo);
                log.info("Insert exitoso. Filas afectadas: " + filasAfectadas);
            } else {
                log.warn("No se inserto ningún vehiculo");
            }

        } catch (SQLException e) {
            log.error("Error al insertar vehiculo: {}", e.getMessage());
        } finally {
            // 6. Cerramos recursos
            try {
                if (ps != null) ps.close();
                connection.close();
                log.info("Conexion Cerrada");
            } catch (SQLException e) {
                log.error("Error cerrando PreparedStatement: {}", e.getMessage());
            }
        }
    }

}
