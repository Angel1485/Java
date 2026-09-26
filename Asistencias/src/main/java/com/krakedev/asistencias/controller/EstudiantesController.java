package com.krakedev.asistencias.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.krakedev.asistencias.model.Estudiante;
import com.krakedev.asistencias.services.ServicioEstudiantes;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
	
	private final ServicioEstudiantes servicioEstudiantes;

    public EstudiantesController(ServicioEstudiantes servicioEstudiantes) {
        this.servicioEstudiantes = servicioEstudiantes;
    }
    
    // POST /estudiantes → crear
    @PostMapping
    public Estudiante agregar(@RequestBody Estudiante estudiante) {
    	return servicioEstudiantes.agregar(estudiante);
    }

    // GET /estudiantes → listar todos
    @GetMapping
    public List<Estudiante> listar() {
        return servicioEstudiantes.listar();
    }

    // GET /estudiantes/{cedula} → buscar uno
    @GetMapping("/{cedula}")
    public Estudiante buscar(@PathVariable String cedula) {
        return servicioEstudiantes.buscarPorCedula(cedula);
    }

    // PUT /estudiantes/{cedula} → actualizar
    @PutMapping("/{cedula}")
    public Estudiante actualizar(@PathVariable String cedula, @RequestBody Estudiante nuevo) {
       return servicioEstudiantes.actualizar(cedula, nuevo);
    }

    // DELETE /estudiantes/{cedula} → eliminar
    @DeleteMapping("/{cedula}")
    public boolean eliminar(@PathVariable String cedula) {
    	return servicioEstudiantes.eliminar(cedula);
    }

}
