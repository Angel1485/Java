import figuras.Rectangulo;
import figuras.Circulo;
import figuras.Cuadrado;

public class TestFiguras {
    public static void main(String[] args) {

        // PRUEBA RECTÁNGULO 
        Rectangulo rect1 = new Rectangulo(4, 2);
        Rectangulo rect2 = new Rectangulo(5, 3);

        double perim1 = rect1.calcularPerimetro();
        double perim2 = rect2.calcularPerimetro();

        System.out.println("=== PRUEBA RECTÁNGULO ===");
        System.out.println("Rectángulo 1: base = " + rect1.getBase() + ", altura = " + rect1.getAltura());
        System.out.println("Perímetro = " + perim1);

        System.out.println("Rectángulo 2: base = " + rect2.getBase() + ", altura = " + rect2.getAltura());
        System.out.println("Perímetro = " + perim2 + "\n");

        // PRUEBA CUADRADO
        Cuadrado cuad1 = new Cuadrado(4);
        Cuadrado cuad2 = new Cuadrado(7);
        Cuadrado cuad3 = new Cuadrado(10);

        double area1 = cuad1.calcularArea();
        double area2 = cuad2.calcularArea();
        double area3 = cuad3.calcularArea();

        double perimCuad1 = cuad1.calcularPerimetro();
        double perimCuad2 = cuad2.calcularPerimetro();
        double perimCuad3 = cuad3.calcularPerimetro();

        System.out.println("=== PRUEBA CUADRADO ===");
        System.out.println("Cuadrado 1: lado = " + cuad1.getLado());
        System.out.println("Área = " + area1);
        System.out.println("Perímetro = " + perimCuad1);

        System.out.println("Cuadrado 2: lado = " + cuad2.getLado());
        System.out.println("Área = " + area2);
        System.out.println("Perímetro = " + perimCuad2);

        System.out.println("Cuadrado 3: lado = " + cuad3.getLado());
        System.out.println("Área = " + area3);
        System.out.println("Perímetro = " + perimCuad3 + "\n");

        // PRUEBA CÍRCULO
        System.out.println("=== PRUEBA CÍRCULO ===");
        Circulo miCirculo = new Circulo(7.5);
        System.out.println("Radio del círculo: " + miCirculo.getRadio());
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro() + "\n");

        // VALIDACIÓN DE SETTERS (como pide el reto)
        System.out.println("=== VALIDACIÓN DE MODIFICACIÓN ===");
        System.out.println("→ Cambiamos valores con setters y verificamos con getters:");

        rect1.setBase(10);
        rect1.setAltura(6);
        System.out.println("\nRectángulo 1 → Nuevo base: " + rect1.getBase() + ", Nueva altura: " + rect1.getAltura());
        System.out.println("Nuevo perímetro: " + rect1.calcularPerimetro());

        cuad1.setLado(15);
        System.out.println("\nCuadrado 1 → Nuevo lado: " + cuad1.getLado());
        System.out.println("Nueva área: " + cuad1.calcularArea());

        miCirculo.setRadio(12);
        System.out.println("\nCírculo → Nuevo radio: " + miCirculo.getRadio());
        System.out.println("Nueva área: " + miCirculo.calcularArea());
    }
}
