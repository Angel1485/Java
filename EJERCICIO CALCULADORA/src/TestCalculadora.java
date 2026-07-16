import calculadora.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) throws Exception {
        
        // Creamos un objeto de la clase Calculadora
        Calculadora miCalc = new Calculadora();

        double n1 = 15;
        double n2 = 6;

        // --- Pruebas anteriores ---
        System.out.println("=== SUMA ===");
        System.out.println(n1 + " + " + n2 + " = " + miCalc.sumar(n1, n2) + "\n");

        System.out.println("=== RESTA ===");
        System.out.println(n1 + " - " + n2 + " = " + miCalc.restar(n1, n2) + "\n");

        // Prueba de Multiplicar
        double a = 8;
        double b = 5;
        double resMult = miCalc.multiplicar(a, b);
        System.out.println("=== MULTIPLICACIÓN ===");
        System.out.println(a + " × " + b + " = " + resMult + "\n");

        // Prueba de Dividir
        double c = 20;
        double d = 4;
        double resDiv = miCalc.dividir(c, d);
        System.out.println("=== DIVISIÓN ===");
        System.out.println(c + " ÷ " + d + " = " + resDiv + "\n");

        // Prueba especial: división entre cero // Se llama directamente la funcion
        System.out.println("=== PRUEBA DE ERROR ===");
        miCalc.dividir(15, 0);

        // --- Prueba de promediar ---
        System.out.println();
        System.out.println("=== PRUEBA PROMEDIO ===");
        double num1 = 10;
        double num2 = 8;
        double num3 = 9;

        double resultadoPromedio = miCalc.promediar(num1, num2, num3);

        System.out.println("Números a promediar: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("El promedio es: " + resultadoPromedio + "\n");

        // --- Prueba de mostrarResultado ---
        System.out.println("=== MENSAJE SOLICITADO ===");
        miCalc.mostrarResultado();

    }
}
