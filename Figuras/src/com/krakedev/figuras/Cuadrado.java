package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Cuadrado extends FiguraPadre{

    //Atributo
    private int lado;
    
    public Cuadrado(String nombre, String color) {
        super(nombre, color);
        this.lado = lado;
    }
    
    @Override 
    public void imprimirDetalle() {
        System.out.println("CUADRADO [" + getColor() + "] - Perímetro: " +
                           calcularPerimetro() + " | Área: " + calcularArea()); 
    }
    
    
    //Metodo calcularPerimetro
    @Override //verifica si existe y sobreescribe el metodo del padre
    public int calcularPerimetro() {
        return 4 * lado;
    }
    
    // Area del cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
//    //Diagonal del cuadrado = lado * √2
//    @Override
//    public double calcularDiametro() {
//        return lado * Math.sqrt(2);
//    }
//    
//    //Apotema = mitad del lado
//    @Override
//    public double calcularApotema() {
//        return lado / 2.0;
//    }
//
//    //Area del circulo que lo rodea (radio = diagonal / 2)
//    @Override
//    public double calcularAreaCircunscrita() {
//        double radio = calcularDiametro() / 2.0;
//        return Math.PI * radio * radio;
//    }
//
//    @Override
//    public double calcularAreaInscrita() {
//        double radio = lado / 2.0;
//        return Math.PI * radio * radio;
//    }
//
//    //Area del círculo inscrito (radio = lado / 2)
//    @Override
//    public double calcularVolumen(double profundidad) {
//        return calcularArea() * profundidad;
//    }
//    
    
    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
}
