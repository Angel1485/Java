package com.krakedev.figuras;

/**
 *
 * @author asarango
 */

//se añade la clase abstract
public abstract class FiguraPadre {
    
    private String nombre;
    private String color;

    public FiguraPadre(String nombre , String color){    
        this.nombre=nombre;
        this.color=color;
    }
    
    // Métodos abstractos: obligan a las hijas a implementarlos
    //Ahora con metodos abstractos sin cuerpo
    public abstract int calcularPerimetro();
    public abstract double calcularArea();
    
    
//    //Nuevos métodos abstractos geométricos
//    public abstract double calcularDiametro();
//    public abstract double calcularApotema();
//    public abstract double calcularAreaCircunscrita();
//    public abstract double calcularAreaInscrita();
//    public abstract double calcularVolumen(double profundidad);
    
    public void imprimirDetalle(){
         System.out.println("Figura: " + nombre + " | Color: " + color);;
    }

    // Metodo calcular perimetro con cuerpo
    // public int calcularPerimetro(){
    //     return 0;
    // }
    
    // Metodo base para el area con cuerpo
    // public double calcularArea() {
    //     return 0;
    // }
    
    @Override
    public String toString() {
        return "Figura{ " + "nombre=" + nombre  + ", color=" + color +'}';
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
