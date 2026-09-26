package com.krakedev.asistencias.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.krakedev.asistencias.model.Asistencia;
import com.krakedev.asistencias.model.RegistroAsistencia;
import com.krakedev.asistencias.services.ServicioAsistencia;
import com.krakedev.asistencias.services.ServicioEstudiantes;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {
	
	private final ServicioAsistencia servicioAsistencia ;
	
	public AsistenciaController(ServicioAsistencia servicioAsistencia) {
        this.servicioAsistencia = servicioAsistencia;
    }

    // POST /asistencias/{cedula} → registrar asistencia
    @PostMapping("/{cedula}")
    public RegistroAsistencia registrar(@PathVariable String cedula) {
        return servicioAsistencia.registrarAsistencia(cedula);
    }

    // GET /asistencias/{cedula} → consultar asistencias de un estudiante
    @GetMapping("/{cedula}")
    public List<RegistroAsistencia> consultar(@PathVariable String cedula) {
        return servicioAsistencia.consultarAsistencia(cedula);
    }

}
