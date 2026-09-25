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

//    @Override
//    public double calcularDiametro() {
//        return Math.max(lado1, Math.max(lado2, lado3));
//    }
//
//    @Override
//    public double calcularApotema() {
//         // La apotema de un triángulo equilátero es (lado * √3) / 6
//        // Si no es equilátero, no tiene apotema definida → devolvemos 0
//        if (lado1 == lado2 && lado2 == lado3) {
//            return (lado1 * Math.sqrt(3)) / 6.0;
//        }
//        return 0;    }
//
//    @Override
//    public double calcularAreaCircunscrita() {
//        // Radio del círculo circunscrito: R = (a*b*c) / (4 * Área)
//        double area = calcularArea();
//        if (area == 0) return 0;
//        double radio = (lado1 * lado2 * lado3) / (4.0 * area);
//        return Math.PI * radio * radio;
//    }
//
//    @Override
//    public double calcularAreaInscrita() {
//        // Radio del círculo inscrito: r = Área / semiperímetro
//        double s = (lado1 + lado2 + lado3) / 2.0;
//        if (s == 0) return 0;
//        double radio = calcularArea() / s;
//        return Math.PI * radio * radio;
//    }
//
//    @Override
//    public double calcularVolumen(double profundidad) {
//        // Extruimos la figura (prisma triangular)
//        return calcularArea() * profundidad;
//    }
//    
}
