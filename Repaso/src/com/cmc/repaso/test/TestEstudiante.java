package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        // Instanciar objeto
        Estudiante est1 = new Estudiante("María López");
        
        // Probar con nota aprobada
        est1.calificar(9.2);
        System.out.println("Estudiante: " + est1.getNombre());
        System.out.println("Nota: " + est1.getNota());
        System.out.println("Resultado: " + est1.getResultado() + "\n");

        // Probar con nota reprobada
        Estudiante est2 = new Estudiante("Juan Pérez");
        est2.calificar(7.5);
        System.out.println("Estudiante: " + est2.getNombre());
        System.out.println("Nota: " + est2.getNota());
        System.out.println("Resultado: " + est2.getResultado());
    }
}
