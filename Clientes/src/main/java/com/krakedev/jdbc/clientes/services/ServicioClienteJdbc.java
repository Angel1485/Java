package com.krakedev.jdbc.clientes.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.krakedev.clientes.entidades.Cliente;
import com.krakedev.jdbc.clientes.ClienteJdbc;

@Service
public class ServicioClienteJdbc {

    //Crear Cliente
    public Cliente ingresarCliente(Cliente cliente) {
       
        Cliente clienteRecuperado = ClienteJdbc.insert(cliente.getCedula(),cliente.getNombre(), cliente.getApellido(), cliente.getEdad());
        return clienteRecuperado;
    }
    
    // Lista todos los clientes
    public List<Cliente> listarClientes() {
    	
    	return  ClienteJdbc.listar();
    }
    
    //Buscar cliente cedula
    public Cliente buscarCedula(String cedula) {
        
    	return ClienteJdbc.buscar(cedula);
        
    }

    //Actualizar Cliente
    public Cliente actualizar(String cedula , Cliente clienteActualizado) {
        
    	return ClienteJdbc.actualizar(cedula, clienteActualizado.getNombre(), clienteActualizado.getApellido(), clienteActualizado.getEdad());
        
    }

    //Eliminar Cliente
    public boolean eliminarCliente(String cedula) {
    	return  ClienteJdbc.eliminar(cedula);
         
    }

}
