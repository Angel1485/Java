import calculadora.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) throws Exception {
        
        // Creamos un objeto de la clase Calculadora
        Calculadora miCalc = new Calculadora();

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

    }
}
