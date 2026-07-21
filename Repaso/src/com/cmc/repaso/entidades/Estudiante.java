package com.cmc.repaso.entidades;

public class Estudiante {
    // Atributos solicitados
    private String nombre;
    private double nota;
    private String resultado;

    // Constructor que recibe nombre
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Método calificar
    public void calificar(double notaRecibida) {
        // Asignar la nota al atributo
        this.nota = notaRecibida;

        // Determinar el resultado
        if (notaRecibida < 8) {
            this.resultado = "F";
        } else if (notaRecibida >= 8) {
            this.resultado = "A";
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
}
