package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

/**
 *
 * @author asarango
 */
public class TestConstructor {

    public static void main(String[] args) {
        
       Hija h = new Hija(2,3,"Justin");  //herada el constructor del padre con super asi lo coloquemos o no en la hija
       
        System.err.println("" + h);
    }
    
}
