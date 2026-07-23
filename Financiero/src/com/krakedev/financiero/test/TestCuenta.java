package com.krakedev.financiero.test;

import com.krakedev.financiero.entidades.Cuenta;

public class TestCuenta {

    public static void main(String[] args) {
        // Creamos la cuenta
        Cuenta miCuenta = new Cuenta("CT-001");
        // Invocamos imprimir()
        miCuenta.imprimir();
    }
}
