import calculadora.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) throws Exception {
        
        // Creamos el objeto
        Calculadora miCalc = new Calculadora();

        // VALIDACIÓN INICIAL: Valores por defecto (con GETTERS)
        System.out.println("=== VALORES INICIALES (ANTES DE MODIFICAR) ===");
        System.out.println("Número 1: " + miCalc.getNumero1());
        System.out.println("Número 2: " + miCalc.getNumero2());
        System.out.println("Resultado: " + miCalc.getResultado());
        System.out.println("Operación: " + miCalc.getOperacionRealizada() + "\n");

        // PRUEBAS DE OPERACIONES
        double n1 = 15;
        double n2 = 6;

        System.out.println("=== SUMA ===");
        System.out.println(n1 + " + " + n2 + " = " + miCalc.sumar(n1, n2) + "\n");

        System.out.println("=== RESTA ===");
        System.out.println(n1 + " - " + n2 + " = " + miCalc.restar(n1, n2) + "\n");

        double a = 8;
        double b = 5;
        double resMult = miCalc.multiplicar(a, b);
        System.out.println("=== MULTIPLICACIÓN ===");
        System.out.println(a + " × " + b + " = " + resMult + "\n");

        double c = 20;
        double d = 4;
        double resDiv = miCalc.dividir(c, d);
        System.out.println("=== DIVISIÓN ===");
        System.out.println(c + " ÷ " + d + " = " + resDiv + "\n");

        System.out.println("=== PRUEBA DE ERROR ===");
        miCalc.dividir(15, 0);
        System.out.println();

        System.out.println("=== PRUEBA PROMEDIO ===");
        double num1 = 10;
        double num2 = 8;
        double num3 = 9;
        double resultadoPromedio = miCalc.promediar(num1, num2, num3);
        System.out.println("Números a promediar: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("El promedio es: " + resultadoPromedio + "\n");

        // VALIDACIÓN DE SETTERS: Cambiamos valores manualmente
        System.out.println("=== MODIFICACIÓN CON SETTERS ===");
        miCalc.setNumero1(99.99);
        miCalc.setNumero2(45.5);
        miCalc.setResultado(145.49);
        miCalc.setOperacionRealizada("Modificación manual");

        // Leemos los nuevos valores con GETTERS
        System.out.println("Nuevo número 1: " + miCalc.getNumero1());
        System.out.println("Nuevo número 2: " + miCalc.getNumero2());
        System.out.println("Nuevo resultado: " + miCalc.getResultado());
        System.out.println("Nueva operación: " + miCalc.getOperacionRealizada() + "\n");

        // MENSAJE FINAL
        System.out.println("=== MENSAJE SOLICITADO ===");
        miCalc.mostrarResultado();
    }
}
