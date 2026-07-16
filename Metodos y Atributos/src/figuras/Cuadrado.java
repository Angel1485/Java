package figuras;

public class Cuadrado {

    // Atributo solicitado
    public double lado;

    // Constructor vacío
    public Cuadrado() {
    }

    // Constructor con valor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Método solicitado: calcularArea
    // No recibe parámetros, devuelve el área
    public double calcularArea() {
        // Fórmula: lado * lado
        double area = this.lado * this.lado;
        return area;
    }

    // NUEVO MÉTODO: calcular Perímetro del cuadrado
    // No recibe parámetros, usa el atributo "lado"
    public double calcularPerimetro() {
        // Fórmula: lado × 4
        double perimetro = this.lado * 4;
        return perimetro;
    }
}
