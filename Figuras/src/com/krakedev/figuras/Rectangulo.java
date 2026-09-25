package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class Rectangulo extends FiguraPadre {
  
    //Atributos
    private int base;
    private int altura;
    
    public Rectangulo(String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    //Metodo calcularPerimetro
    @Override  //verifica si existe y sobreescribe el metodo del padre
    public int calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    //Metodo Area del Rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
      @Override 
    public void imprimirDetalle() {
        System.out.println("Triagulo [" + getColor() + "] - Perímetro: " +
                           calcularPerimetro() + " | Área: " + calcularArea()); 
    }
    

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
   
}
