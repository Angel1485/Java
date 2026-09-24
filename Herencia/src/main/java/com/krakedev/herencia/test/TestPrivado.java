package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

/**
 *
 * @author asarango
 */
public class TestPrivado {

     public static void main(String[] args) {
         
         Hija h = new Hija(2,3,"Justin");
         
         h.guardarSecreto();
         
     }
}
