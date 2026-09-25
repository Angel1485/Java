package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Triangulo extends FiguraPadre{
    
    // Atributos si calculas usando los tres lados para el perimetro )
    private double lado1;
    private double lado2;
    private double lado3;

    // Atributos si calculas usando base y altura para el area tradicional
    private double base;
    private double altura;
    
    public Triangulo(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public int calcularPerimetro() {
      // Suma de los tres lados 
        return (int) (lado1 + lado2 + lado3);
    }

    @Override
    public double calcularArea() {
     // Formula del area: (base * altura) / 2
        return (base * altura) / 2.0;
    }
    
}
