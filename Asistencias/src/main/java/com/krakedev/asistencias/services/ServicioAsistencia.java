package com.krakedev.asistencias.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.model.Asistencia;
import com.krakedev.asistencias.model.Estudiante;
import com.krakedev.asistencias.model.RegistroAsistencia;

@Service
public class ServicioAsistencia {
	
	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();

    private final ServicioEstudiantes servicioEstudiantes;
    
    public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
        this.servicioEstudiantes = servicioEstudiantes;   // inyectado, sin new
    }

    // Registrar asistencia
    public RegistroAsistencia registrarAsistencia(String cedula) {
        //Buscar estudiante por cedula
        Estudiante estudiante = servicioEstudiantes.buscarPorCedula(cedula);
//
//        //Si no existe, retornar null
//        if (estudiante == null) {
//            return null;
//        }
//        
    	//Crear la asistencia con fecha y hora actuales
        Asistencia asistencia = new Asistencia(LocalDate.now(), LocalDateTime.now(), "P");

        //Crear el registro y agregarlo a la lista
        RegistroAsistencia registro = new RegistroAsistencia(estudiante, asistencia);
        registros.add(registro);
        
        //Retornar el registro creado
        return registro;
    }

    // Consultar todas las asistencias de un estudiante
    public List<RegistroAsistencia> consultarAsistencia(String cedula) {
        ArrayList<RegistroAsistencia> resultado = new ArrayList<>();

        for (RegistroAsistencia r : registros) {
            if (r.getEstudiante().getCedula().equals(cedula)) {
                resultado.add(r);
            }
        }

        return resultado;
    }

}
