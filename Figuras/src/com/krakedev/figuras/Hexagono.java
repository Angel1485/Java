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
        return (int) (6 * getLado());
    }

    //Sobrescribir calcularArea
    @Override
    public double calcularArea() {
        // Formula del area de un hexagono regular
        return (3 * Math.sqrt(3) * getLado() * getLado()) / 2;
    }

//    @Override
//    public double calcularDiametro() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public double calcularApotema() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public double calcularAreaCircunscrita() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public double calcularAreaInscrita() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public double calcularVolumen(double profundidad) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
