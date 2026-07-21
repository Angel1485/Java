package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {
    public static void main(String[] args) {
        // Instanciar el objeto
        Validacion val = new Validacion();
        
        // Probar el método con diferentes valores
        boolean resultado1 = val.validarMonto(150.75);
        boolean resultado2 = val.validarMonto(-20);
        boolean resultado3 = val.validarMonto(0);
        
        // Imprimir resultados
        System.out.println("Monto 150.75: " + resultado1); // true
        System.out.println("Monto -20: " + resultado2);   // false
        System.out.println("Monto 0: " + resultado3);     // false
    }
}
