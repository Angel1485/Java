package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Cuadrado extends FiguraPadre{

    //Atributo
    private int lado;
    
    public Cuadrado(String nombre, String color, int lado) {
        super(nombre, color);
        this.lado = lado;
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
