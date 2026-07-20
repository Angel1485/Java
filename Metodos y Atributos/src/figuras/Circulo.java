package figuras;

public class Circulo {
    
    // Atributo
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Constructor con parametros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el ÁREA
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    // Método para calcular el PERÍMETRO
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

}
