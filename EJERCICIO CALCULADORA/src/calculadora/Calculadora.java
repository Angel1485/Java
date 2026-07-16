// Indicamos que pertenece al paquete
package calculadora;

public class Calculadora {

    // Recibe 2 números decimales y devuelve el resultado
    public double sumar(double valor1, double valor2) {
        return valor1 + valor2;  //Retorna directo
    }

    // Recibe 2 números decimales y devuelve el resultado
    public double restar(double valor1, double valor2) {
        return valor1 - valor2;
    }

    // Recibe 2 números decimales y devuelve el resultado
    public double multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        return resultado;  //retorna con variable
    }

    // Recibe dividendo y divisor, devuelve el cociente
    public double dividir(double dividendo, double divisor) {
        // Validación para evitar error al dividir entre 0
        if (divisor == 0) {
            System.out.println("❌ Error: No se puede dividir entre cero");
            return 0; // Valor seguro de retorno
        }
        double resultado = dividendo / divisor;
        return resultado;
    }

    // Recibe 3 números y devuelve su promedio
    public double promediar(double valor1, double valor2, double valor3) {
        double sumaTotal = valor1 + valor2 + valor3;
        double promedio = sumaTotal / 3;
        return promedio;
    }

}
