import calculadora.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) throws Exception {
        
        // Creamos un objeto de la clase Calculadora
        Calculadora miCalc = new Calculadora();

        double a = 8;
        double b = 5;
        double resMult = miCalc.multiplicar(a, b);
        System.out.println("=== MULTIPLICACIÓN ===");
        System.out.println(a + " × " + b + " = " + resMult + "\n");

    }
}
