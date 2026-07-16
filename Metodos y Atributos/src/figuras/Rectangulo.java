package figuras;

public class Rectangulo {

    // Atributos del rectángulo
    public double base;
    public double altura;

    // Constructor vacío
    public Rectangulo() {
    }

    // Constructor con valores
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método solicitado: calcularPerimetro
    // No recibe parámetros, devuelve el perímetro
    public double calcularPerimetro() {
        // Fórmula: 2 * base + 2 * altura
        double perimetro = 2 * this.base + 2 * this.altura;
        return perimetro;
    }
}
