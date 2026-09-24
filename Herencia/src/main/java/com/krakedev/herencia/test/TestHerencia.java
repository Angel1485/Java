package com.krakedev.herencia.test;
import com.krakedev.herencia.Hija;

/**
 *
 * @author asarango
 */
public class TestHerencia {

    public static void main(String[] args) {
        
        Hija h = new Hija(2,3,"Justin");
        
        h.setVirtudes(5);
        h.setDefectos(2);
        
        h.imprimir();
    }
}
