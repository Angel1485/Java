package com.krakedev.asistencias.services;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.krakedev.asistencias.model.Estudiante;

@Service
public class ServicioEstudiantes {
	
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Agregar estudiante (no permite duplicados por cedula)
    public Estudiante agregar(Estudiante estudiante) {
        Estudiante existente = buscarPorCedula(estudiante.getCedula());
        if (existente != null) {
            return null;
        }else {
        	 estudiantes.add(estudiante);
        	 return estudiante;
        }
    }

    // Buscar por cedula
    public Estudiante buscarPorCedula(String cedula) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    // Eliminar por cedula
    public boolean eliminar(String cedula) {
        Estudiante encontrado = buscarPorCedula(cedula);
        if (encontrado != null) {
            estudiantes.remove(encontrado);
            return true;
        }else {
        	 return false;
        }
    }

    // Actualizar por cedula
    public Estudiante actualizar(String cedula, Estudiante estudianteActualizado) {
        Estudiante encontrado = buscarPorCedula(cedula);
        if (encontrado != null) {
            encontrado.setNombre(estudianteActualizado.getNombre());
            encontrado.setApellido(estudianteActualizado.getApellido());
        }
        return estudianteActualizado;
    }

    // Listar todos
    public ArrayList<Estudiante> listar() {
        return estudiantes;
    }

}
