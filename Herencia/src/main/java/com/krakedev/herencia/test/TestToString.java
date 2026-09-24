package com.krakedev.herencia.test;

import com.krakedev.herencia.Padre;

/**
 *
 * @author asarango
 */
public class TestToString {

    public static void main(String[] args) {
        
        Padre p  = new Padre(2,3);
        
        System.out.println(p); // La P llama al metodo toString automaticamente
        
        //p.toString(); //Otro ejemplo llamando con toString 
        
        //System.out.println(p.toString());  // Ambos muestran lo mismo 
    }
    
}
