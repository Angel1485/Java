package com.krakedev.figuras;

/**
 *
 * @author asarango
 */
public class TrianguloRectangulo extends FiguraPadre {

    //Atributos
    private double catetoA;
    private double catetoB;
    private double hipotenusa; // Se calcula, no se recibe

    //Constructor
    public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
        super(nombre, color);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        
        // Calculamos la hipotenusa automáticamente usando Math.hypot (que aplica Pitágoras)
        // Math.hypot(a, b) es equivalente a Math.sqrt(a*a + b*b)
        this.hipotenusa = Math.hypot(catetoA, catetoB);
    }

    //Sobrescribir calcularPerimetro
    // El perimetro es la suma de los 3 lados
    @Override
    public int calcularPerimetro() {
        // Como el metodo padre devuelve un 'int', convertimos el resultado a entero
        return (int) (getCatetoA() + getCatetoB() + getHipotenusa());
    }

    // Sobrescribir calcularArea
    // El area de un triangulo rectángulo es (catetoA * catetoB) / 2
    @Override
    public double calcularArea() {
        return (getCatetoA() * getCatetoB()) / 2.0;
    }
    
    
    /**
     * @return the catetoA
     */
    public double getCatetoA() {
        return catetoA;
    }

    /**
     * @param catetoA the catetoA to set
     */
    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    /**
     * @return the catetoB
     */
    public double getCatetoB() {
        return catetoB;
    }

    /**
     * @param catetoB the catetoB to set
     */
    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    /**
     * @return the hipotenusa
     */
    public double getHipotenusa() {
        return hipotenusa;
    }

    /**
     * @param hipotenusa the hipotenusa to set
     */
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    
}
