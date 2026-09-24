package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

/**
 *
 * @author asarango
 */
public class TestAhorros {

    public static void main(String[] args) {
       
        // Usaremos este mismo monto para los 3
        double montoAhorrar = 100.0; 

        // PASO 1: Padre
        System.out.println("\n--- PASO 1: PADRE ---");
        // Creamos un objeto Padre (Le pongo valores de ejemplo)
        Padre padre = new Padre(1, 2, "Justin");
        
        // Invocamos ahorrar()
        padre.ahorrar(montoAhorrar);
        
        // Imprimimos resultados
        System.out.println(padre);


        // PASO 2: Hija
        System.out.println("\n--- PASO 2: HIJA ---");
        // Creamos un objeto Hija 
        Hija hija = new Hija(2, 3, "Jhoana");
        
        // Invocamos ahorrar() 
        hija.ahorrar(montoAhorrar);
        
        // Imprimimos resultados
        System.out.println(hija);

        // PASO 3: Hijo
        System.out.println("\n--- PASO 3: HIJO ---");
        // Creamos un objeto Hijo 
        Hijo hijo = new Hijo(3, 4, 5, "Juan");
        
        // Invocamos ahorrar()
        hijo.ahorrar(montoAhorrar);
        
        // Imprimimos resultados
        System.out.println(hijo);

    }
    
}
