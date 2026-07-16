import figuras.Rectangulo;
import figuras.Cuadrado;

public class TestFiguras {
    public static void main(String[] args) {

        // Prueba del Rectángulo //
        Rectangulo rect1 = new Rectangulo(4, 2); // Ejemplo del enunciado
        Rectangulo rect2 = new Rectangulo(5, 3);

        double perim1 = rect1.calcularPerimetro();
        double perim2 = rect2.calcularPerimetro();

        System.out.println("=== PRUEBA RECTÁNGULO ===");
        System.out.println("Rectángulo 1: base = " + rect1.base + ", altura = " + rect1.altura);
        System.out.println("Perímetro = " + perim1);

        System.out.println("Rectángulo 2: base = " + rect2.base + ", altura = " + rect2.altura);
        System.out.println("Perímetro = " + perim2 + "\n");

        // Prueba del Cuadrado //
        Cuadrado cuad1 = new Cuadrado(4); // Ejemplo del enunciado
        Cuadrado cuad2 = new Cuadrado(7);

        double area1 = cuad1.calcularArea();
        double area2 = cuad2.calcularArea();

        double perimCuad1 = cuad1.calcularPerimetro();
        double perimCuad2 = cuad2.calcularPerimetro();

        System.out.println("=== PRUEBA CUADRADO ===");
        System.out.println("Cuadrado 1: lado = " + cuad1.lado);
        System.out.println("Área = " + area1);
        System.out.println("Perímetro = " + perimCuad1);

        System.out.println("Cuadrado 2: lado = " + cuad2.lado);
        System.out.println("Área = " + area2);
        System.out.println("Perímetro = " + perimCuad2);
    }
}
