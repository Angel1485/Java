package com.cmc.repaso.entidades;

public class Estudiante {
    // Atributos solicitados
    private String nombre;
    private double nota;
    private String resultado;
    private double asistencia; 

        public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    // Constructor que recibe nombre
    public Estudiante(String nombre, double asistencia) {
        this.nombre = nombre;
        this.asistencia = asistencia;
    }

    // Método calificar
    public void calificar(double notaRecibida ) {
        // Asignar la nota al atributo
        this.nota = notaRecibida;

        if(notaRecibida >= 8 && this.getAsistencia() >= 80){
            this.resultado = "A";
        }else if(notaRecibida >=8 && this.getAsistencia() < 80){
            this.resultado = "X";
        }else{
             this.resultado = "F";
        }

    }

    // Opcional: Getters para ver los valores al probar
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }
    public String getResultado() {
        return resultado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getAsistencia() {
        return asistencia;
    }
}
