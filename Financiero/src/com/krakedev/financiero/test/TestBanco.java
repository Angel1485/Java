package com.krakedev.financiero.test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.servicios.Banco;

public class TestBanco {

    public static void main(String[] args) {

        Banco miBanco = new Banco();
        Cliente cli1 = new Cliente("0101234567", "Ana", "Vásquez");

        // Crear varias cuentas para ver los códigos consecutivos
        Cuenta c1 = miBanco.crearCuenta(cli1);
        Cuenta c2 = miBanco.crearCuenta(cli1);
        Cuenta c3 = miBanco.crearCuenta(cli1);

        // Mostrar los IDs generados automaticamente
        System.out.println("Cuenta 1 ID: " + c1.getId()); // 1000
        System.out.println("Cuenta 2 ID: " + c2.getId()); // 1001
        System.out.println("Cuenta 3 ID: " + c3.getId()); // 1002

        System.out.println("\n=== Datos de la primera cuenta ===");
        c1.imprimir();
    }

}
