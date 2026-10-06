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

        //Si no existe, retornar null
        if (estudiante == null) {
            return null;
        }else{
        	
        	//Crear la asistencia con fecha y hora actuales
            Asistencia asistencia = new Asistencia(LocalDate.now(), LocalDateTime.now(), "P");

            //Crear el registro y agregarlo a la lista
            RegistroAsistencia registro = new RegistroAsistencia(estudiante, asistencia);
            registros.add(registro);
            
            //Retornar el registro creado
            return registro;
        }
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
    
 // buscar un registro específico por cédula y fecha
    public RegistroAsistencia buscarRegistroAsistencia(String cedula, LocalDate fecha) {
        for (RegistroAsistencia r : registros) {
            if (r.getEstudiante().getCedula().equals(cedula) && r.getAsistencia().getFechaClase().equals(fecha)) {
                return r;
            }
        }
        return null;
    }
    
 // Editar el estado de la asistencia de un estudiante en una fecha
    public RegistroAsistencia editarAsistencia(String cedula, LocalDate fecha, String estado) {
        // Recorremos la lista de registros 
        for (RegistroAsistencia r : registros) {
            // Verificamos si la cédula del estudiante y la fecha de la asistencia coinciden
            if (r.getEstudiante().getCedula().equals(cedula) && r.getAsistencia().getFechaClase().equals(fecha)) {
                
                // Actualizamos el estado de la asistencia
                r.getAsistencia().setEstado(estado);
                
                // Retornamos el registro actualizado
                return r;
            }
        }
        
        // Retorna null si no se encuentra el registro o el estudiante
        return null;
    }

    // Eliminar asistencia ajustado a tu estilo
    public boolean eliminarAsistencia(String cedula, LocalDate fecha) {
        RegistroAsistencia encontrado = buscarRegistroAsistencia(cedula, fecha);
        
        if (encontrado != null) {
            registros.remove(encontrado);
            return true;
        } else {
            return false;
        }
    }
    

}
