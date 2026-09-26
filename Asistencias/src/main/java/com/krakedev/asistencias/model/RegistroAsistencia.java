package com.krakedev.asistencias.model;

public class RegistroAsistencia {
	
	private Estudiante estudiante;
    private Asistencia asistencia;

    // Constructor vacio
    public RegistroAsistencia() {
    }

    // Constructor con parametros
    public RegistroAsistencia(Estudiante estudiante, Asistencia asistencia) {
        this.estudiante = estudiante;
        this.asistencia = asistencia;
    }

    // Getters y Setters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    // toString
    @Override
    public String toString() {
        return "RegistroAsistencia [estudiante=" + estudiante + ", asistencia=" + asistencia + "]";
    }

}
