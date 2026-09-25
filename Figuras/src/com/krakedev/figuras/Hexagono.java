package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Hexagono extends FiguraPadre{

    // Atributo
    private double lado; 

    //Constructor
    public Hexagono(String nombre, String color, double lado) {
        super(nombre, color); // Enviamos nombre y color a Figura
        this.lado = lado;
    }

    //Sobrescribir calcularPerimetro
    @Override
    public int calcularPerimetro() {
        // El perimetro es 6 veces el lado. Lo casteamos a int porque el método padre devuelve int.
        return (int) (6 * lado);
    }

    //Sobrescribir calcularArea
    @Override
    public double calcularArea() {
        // Formula del area de un hexagono regular
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }
    
}
