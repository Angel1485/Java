package com.krakedev.test;

import com.krakedev.figuras.Circulo;
import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.FiguraPadre;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

/**
 *
 * @author asarango
 */
public class TestFiguras {

    public static void main(String[] args) {
       
         //Instanciar un objeto FiguraPadre --- FiguraPadre ahora es abstract
        //FiguraPadre figura = new FiguraPadre("Generica", "Rojo");  

//        //Instanciar un objeto Cuadrado
//        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Azul" , 6);
//
//        //Instanciar un objeto Triangulo
//        Triangulo triangulo = new Triangulo("Triangulo", "Verde");
//        
//        Circulo c = new Circulo("Circulo", "Rojo");
//
//        //Imprimir los objetos
//        System.out.println("--- Imprimiendo Objetos ---");
//        //System.out.println(figura);  --- FiguraPadre ahora es abstract
//        System.out.println(cuadrado);
//        System.out.println(triangulo); 
//        System.out.println(c); 
//        
        
        
        FiguraPadre f =  new Cuadrado ("Figura Generica", "Rojo");
        
        f.imprimirDetalle();
        
        FiguraPadre f1 =  new Rectangulo ("Figura Generica", "Rojo");
        
        f1.imprimirDetalle();
        
//        f.calcularArea();
//        f.calcularPerimetro();
        
        System.out.println(f);
        
        
    }
    
}
