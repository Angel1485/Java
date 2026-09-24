package com.krakedev.herencia.test;
import com.krakedev.herencia.Hija;
import java.util.ArrayList;

/**
 *
 * @author asarango
 */
public class TestArrayList {

 
    public static void main(String[] args) {
        
         ArrayList<Hija> listaDeHijas= new ArrayList<Hija>(); // donde se almacenara las hijas
         
         Hija h1 =  new Hija(2,23);
         
         h1.setDefectos(2);
         h1.setVirtudes(4);
         
         listaDeHijas.add(h1);
         
         Hija h2 =  new Hija(2,23);
         
         h2.setDefectos(3);
         h2.setVirtudes(5);
         
         listaDeHijas.add(h2);
         
         System.out.println("Lista de hijas" + listaDeHijas);
    }
    
}
