package com.krakedev.jdbc.clientes;
import java.sql.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.krakedev.clientes.entidades.Cliente;
import com.krakedev.jdbc.Conexion;

public class ClienteJdbc {
	
	private static final Logger log = LogManager.getLogger(ClienteJdbc.class);
	
	//Metodo Crear Cliente
	public static Cliente insert (String cedula, String nombre, String apellido, int edad) {
		
		Connection con = null;
		PreparedStatement ps = null;
		Cliente cliente = null;
		
		try {
			con = Conexion.getConnection();
			log.info("Conexion Exitosa");
		
			//Para postgres es taller_estudiantes.clientes y para Mysql es mydb.clientes
			String sql = """ 
						 INSERT INTO mydb.clientes
					     (cedula, nombre, apellido, edad)
						  VALUES(?,?,?,?);
						 """;
			
			ps = con.prepareStatement(sql);  // Prepara los datos
			ps.setString(1, cedula);
			ps.setString(2, nombre);
			ps.setString(3, apellido);
			ps.setInt(4, edad);
			
			cliente = new Cliente(cedula, nombre, apellido, edad);
			int filas = ps.executeUpdate();  // Siempre se debe ejecutar
			log.info("Filas Insertadas: " + filas);
			
		}catch(Exception e) {
			
			log.error("Error al insertar el cliente");
			//e.printStackTrace();   
			//Ayuda a ver cual es el verdadero error (e.printStackTrace();   )
			
		}finally {
			
			try {
				con.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Error de Conexion");
			}
			
		}
		
		return cliente;
		
	}
	
	
	public static List<Cliente> listar() {
		
		List<Cliente> clientes = new ArrayList<>(); 
		Connection con = null;
		
		try {
			
			con = Conexion.getConnection();
			
			String sql = """ 
				 	     SELECT * FROM mydb.clientes;
				         """;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // Siempre se debe ejecutar
			
			while(rs.next()) { // Recuperamos los datos mientras existan
				
				Cliente c = new Cliente(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"));
				clientes.add(c);
			}

		}catch(Exception e) {
			
			log.error("Error al listar" ,e.getMessage());
			
		}finally {
			try {
				con.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Error de Conexion");
			}
			
		}
		
		return clientes;
		
	}
	
	public static Cliente buscar(String cedula) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		ResultSet rs = null;
		Cliente cliente =  null;
		
		try {
			
			con = Conexion.getConnection();
			
			sql = """ 
		 	      SELECT * FROM mydb.clientes
		 	      WHERE cedula = ?;
		          """;
			
			ps = con.prepareStatement(sql);	
			ps.setString(1, cedula);
			rs = ps.executeQuery(); // Siempre se debe ejecutar
			
			if (rs.next()) {  //Devuelve verdadero o falso
				
				cliente = new Cliente(rs.getString("cedula"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("edad"));
				
			}

		}catch(Exception e) {
			
			log.error("Error al buscar la cedula" ,e.getMessage());
			
		}finally {
			try {
				con.close();
				rs.close();
				ps.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Error de Conexion");
			}
			
		}
		
		return cliente;
		
	}
	
	public static Cliente actualizar(String cedula, String nuevoNombre,String nuevoApellido, int nuevaEdad) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		Cliente cliente =  null;
		
		try {
			
			con = Conexion.getConnection();
			
			sql = """ 
				  UPDATE mydb.clientes
				  SET nombre=?, apellido=?, edad=?
				  WHERE cedula=?;
			      """;
			
			ps = con.prepareStatement(sql);	
			ps.setString(1, nuevoNombre);
			ps.setString(2, nuevoApellido);
			ps.setInt(3, nuevaEdad);
			ps.setString(4, cedula);
			
			int filas = ps.executeUpdate();
			cliente = new Cliente(cedula, nuevoNombre, nuevoApellido, nuevaEdad); //Cargo el cliente con los nuevos datos
			
			log.info("Filas actualziadas: " + filas);
			
		}catch(Exception e) {
			
			log.error("Error al buscar la cedula" ,e.getMessage());
			
		}finally {
			try {
				con.close();
				ps.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Error de Conexion");
			}
			
		}
		
		return cliente;
		
		
	}
	
	
	public static boolean eliminar(String cedula) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		Cliente cliente =  null;
		
		try {
			
			con = Conexion.getConnection();
			
			sql = """ 
			      DELETE FROM mydb.clientes
				  WHERE cedula=?;
			      """;
			
			ps = con.prepareStatement(sql);	
			ps.setString(1, cedula);
			
			int filas = ps.executeUpdate();
			log.info("Filas eliminadas: " + filas);
			return true;
		}catch(Exception e) {
			
			log.error("Error al eliminar" ,e.getMessage());
			return false;
			
		}finally {
			try {
				con.close();
				ps.close();
				log.info("Conexion Cerrada");
			} catch (SQLException e) {
				log.error("Error de Conexion");
			}
			
		}
				
	}

}
