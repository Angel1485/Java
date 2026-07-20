package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {

        // 1. Creación inicial 
        System.out.println("===== VALORES INICIALES =====");
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // 2. Modificar saldos y tipos, verificar encapsulamiento
        System.out.println("\n===== DESPUÉS DE MODIFICAR =====");
        cuenta1.setTipo("B");
        cuenta1.setSaldo(1250.80);

        cuenta2.setSaldo(450.50);

        cuenta3.setSaldo(3200.00);

        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // 3. 3 cuentas adicionales (probando sobrecarga de constructores)
        System.out.println("\n===== CUENTAS ADICIONALES =====");
        // Usamos constructor de solo ID
        Cuenta cuenta4 = new Cuenta("1001");
        cuenta4.setSaldo(500);

        // Usamos constructor completo
        Cuenta cuenta5 = new Cuenta("1002", "A", 980.25);

        // Usamos constructor de solo ID y cambiamos tipo
        Cuenta cuenta6 = new Cuenta("1003");
        cuenta6.setTipo("B");
        cuenta6.setSaldo(75.90);

        // Imprimimos las nuevas
        cuenta4.imprimir();
        cuenta5.imprimir();
        cuenta6.imprimir();

        // 4. Prueba del formato personalizado
        System.out.println("\n===== FORMATO PERSONALIZADO =====");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}
