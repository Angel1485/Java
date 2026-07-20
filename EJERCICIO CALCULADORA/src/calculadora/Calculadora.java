package calculadora;

public class Calculadora {
    // ATRIBUTOS PRIVADOS (cumpliendo el encapsulamiento)
    private double numero1;
    private double numero2;
    private double resultado;
    private String operacionRealizada;

    // Constructor vacío
    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
        this.resultado = 0;
        this.operacionRealizada = "Ninguna";
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacionRealizada() {
        return operacionRealizada;
    }

    public void setOperacionRealizada(String operacionRealizada) {
        this.operacionRealizada = operacionRealizada;
    }

    // MÉTODOS DE OPERACIONES
    public double sumar(double n1, double n2) {
        // Asignamos valores usando los SETTERS
        setNumero1(n1);
        setNumero2(n2);
        setOperacionRealizada("Suma");
        
        this.resultado = n1 + n2;
        return this.resultado;
    }

    public double restar(double n1, double n2) {
        setNumero1(n1);
        setNumero2(n2);
        setOperacionRealizada("Resta");
        
        this.resultado = n1 - n2;
        return this.resultado;
    }

    public double multiplicar(double n1, double n2) {
        setNumero1(n1);
        setNumero2(n2);
        setOperacionRealizada("Multiplicación");
        
        this.resultado = n1 * n2;
        return this.resultado;
    }

    public double dividir(double n1, double n2) {
        setNumero1(n1);
        setNumero2(n2);
        setOperacionRealizada("División");
        
        if (n2 == 0) {
            System.out.println("ERROR: No se puede dividir entre cero.");
            this.resultado = 0;
            return 0;
        }
        this.resultado = n1 / n2;
        return this.resultado;
    }

    public double promediar(double n1, double n2, double n3) {
        setOperacionRealizada("Promedio de 3 números");
        this.resultado = (n1 + n2 + n3) / 3;
        return this.resultado;
    }

    public void mostrarResultado() {
        // Leemos valores usando los GETTERS
        System.out.println("\n--- INFORMACIÓN ENCAPSULADA ---");
        System.out.println("Último número 1 ingresado: " + getNumero1());
        System.out.println("Último número 2 ingresado: " + getNumero2());
        System.out.println("Operación realizada: " + getOperacionRealizada());
        System.out.println("Resultado final: " + getResultado());
    }
}
