package com.krakedev.jdbc.clientes.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.krakedev.clientes.entidades.Cliente;
import com.krakedev.jdbc.clientes.services.ServicioClienteJdbc;

@RestController
@RequestMapping ("/jdbc/clientes")
public class ControllerClienteJdbc {
	
	private final ServicioClienteJdbc servicioClienteJdbc;

    // Inyeccion por constructor
    public ControllerClienteJdbc(ServicioClienteJdbc servicioClienteJdbc) {
        this.servicioClienteJdbc = servicioClienteJdbc;
    }
 
    @PostMapping("/insertCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
    	return servicioClienteJdbc.ingresarCliente(cliente);
    }

    @GetMapping("/listarCliente")
    public List<Cliente> listar() {
        return servicioClienteJdbc.listarClientes();
    }

    @GetMapping("/{cedula}")
    public Cliente buscarCedula(@PathVariable String cedula) {
        return servicioClienteJdbc.buscarCedula(cedula);
    }
    
    @PutMapping("/{cedula}")
    public Cliente actualizar(@PathVariable String cedula, @RequestBody Cliente cliente) {
        return servicioClienteJdbc.actualizar(cedula, cliente);
    }
    
    @DeleteMapping("/{cedula}")
    public boolean eliminar(@PathVariable String cedula) {
    	
    	Cliente cli = servicioClienteJdbc.buscarCedula(cedula);  //Primero envio a buscar la cedula 
    	if(cli != null) {
    		return servicioClienteJdbc.eliminarCliente(cedula);
    	}
     return false;   
    }

}
