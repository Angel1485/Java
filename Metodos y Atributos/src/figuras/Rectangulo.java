package figuras;

public class Rectangulo {

    // Atributos del rectángulo
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

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
