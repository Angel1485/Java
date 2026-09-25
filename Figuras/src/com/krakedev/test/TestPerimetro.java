package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

/**
 *
 * @author asarango
 */
public class TestPerimetro {

    public static void main(String[] args) {
        
        //Prueba Cuadrado
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo");
        
        // Calculamos su perímetro (Fórmula: 4 * lado)
        int perimetroCuadrado = cuadrado.calcularPerimetro();
        
        // Imprimimos los resultados
        System.out.println("Figura: " + cuadrado.getNombre());
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Perimetro calculado: " + perimetroCuadrado);

        //Prueba Rectángulo
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul");
        
        // Calculamos el perimetro (Formula: 2 * base + 2 * altura)
        int perimetroRectangulo = rectangulo.calcularPerimetro();
        
        // Imprimimos los resultados
        System.out.println("Figura: " + rectangulo.getNombre());
        System.out.println("Base: " + rectangulo.getBase() + ", Altura: " + rectangulo.getAltura());
        System.out.println("Perimetro calculado: " + perimetroRectangulo);
   
    }
    
}
