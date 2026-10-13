package com.krakedev.empleados.controllers;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.krakedev.empleados.entidades.Empleado;
import com.krakedev.empleados.services.ServicioEmpleado;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	
	private final ServicioEmpleado servicioEmpleado;

	public EmpleadoController(ServicioEmpleado servicioEmpleado) {
		this.servicioEmpleado = servicioEmpleado;
	}

	@PostMapping("/insertEmpleado")
	public ResponseEntity<?> crear(@RequestBody Empleado empleado) {
		
		try {
			Empleado creado = servicioEmpleado.crear(empleado);
			return ResponseEntity.status(HttpStatus.CREATED).body(creado);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el empleado");
		}

	}
	
	@GetMapping("/listarEmpleado")
	public ResponseEntity<?> listar(){
		
		try {
			List<Empleado> empleados =  servicioEmpleado.listar();
			return ResponseEntity.ok(empleados);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al listar los empleados");
		}
	    
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<?> buscar(@PathVariable Long id) {
		
		try {
			Empleado empleados =  servicioEmpleado.buscarPorId(id);
			
			if(empleados == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El empleado con el Id no existe: " + id);
			}
			return ResponseEntity.ok(empleados);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al listar los empleados");
		}
	   
	}
	
	@GetMapping("/cargo")
	public  ResponseEntity<?> buscarCargo(@RequestParam String cargo) {
		
		try {
			List<Empleado> empleados =  servicioEmpleado.buscarPorCargo(cargo);
			return ResponseEntity.ok(empleados);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al buscra por cargo");
		}
	}
	
	@GetMapping("/estado")
	public  ResponseEntity<?> buscarEstado(@RequestParam boolean estado) {
		
		try {
			List<Empleado> empleados =  servicioEmpleado.buscarPorEstado(estado);
			return ResponseEntity.ok(empleados);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al buscra por cargo");
		}
	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Empleado empleadoActualizado) {
		try {
			Empleado actualizar =  servicioEmpleado.actualizar(id, empleadoActualizado);
			
			if(actualizar == null) {
			  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El empleado con el Id no existe: " + id);
			}
			return ResponseEntity.ok(actualizar);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualzair al empleado");
		}
	   
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id) {
		try {
			boolean eliminar =  servicioEmpleado.eliminar(id);
			
			if(!eliminar) { //Devuelve falso
			  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El empleado con el Id no existe: " + id);
			}
			return ResponseEntity.ok(eliminar);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar al empleado");
		}
	}

}
