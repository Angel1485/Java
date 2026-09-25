package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.FiguraPadre;
import com.krakedev.figuras.Triangulo;

/**
 *
 * @author asarango
 */
public class TestFiguras {

    public static void main(String[] args) {
       
         //Instanciar un objeto FiguraPadre --- FiguraPadre ahora es abstract
        //FiguraPadre figura = new FiguraPadre("Generica", "Rojo");  

        //Instanciar un objeto Cuadrado
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Azul" , 6);

        //Instanciar un objeto Triangulo
        Triangulo triangulo = new Triangulo("Triangulo", "Verde");

        //Imprimir los objetos
        System.out.println("--- Imprimiendo Objetos ---");
        //System.out.println(figura);  --- FiguraPadre ahora es abstract
        System.out.println(cuadrado);
        System.out.println(triangulo); 
        
    }
    
}
