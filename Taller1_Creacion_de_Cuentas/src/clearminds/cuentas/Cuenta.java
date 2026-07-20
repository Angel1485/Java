package clearminds.cuentas;

public class Cuenta {
    
    // Atributos privados (encapsulamiento estricto)
    private String id;         
    private String tipo;      
    private double saldo;     

    // Constructores solicitados
    // Constructor 1: Recibe solo el ID, asigna tipo "A" por defecto
    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A"; // Valor por defecto obligatorio
    }

    // Constructor 2: Completo, recibe id, tipo y saldo
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }


    // Método imprimir() con formato solicitado
    public void imprimir() {
        System.out.println("************************");
        System.out.println("        CUENTA");
        System.out.println("************************");
        System.out.println("Número de Cuenta: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: USD " + saldo);
        System.out.println("************************");
    }

    // Método con diseño personalizado
    public void imprimirConMiEstilo() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║    DATOS DE TU CUENTA      ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ ID:      " + String.format("%-18s", id) + "║");
        System.out.println("║ TIPO:    " + String.format("%-18s", tipo) + "║");
        System.out.println("║ SALDO:   USD " + String.format("%-15.2f", saldo) + "║");
        System.out.println("╚════════════════════════════╝");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
