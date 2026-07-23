package com.krakedev.financiero.servicios;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;

public class Banco {

    // Atributo inicializado en 1000
    private int ultimoCodigo = 1000;

    // Constructor vacío
    public Banco() {
    }

    // Método crearCuenta según la lógica indicada
    public Cuenta crearCuenta(Cliente cliente) {
        // Convertir el código a String
        String codigoStr = ultimoCodigo + "";

        // Incrementar el código para la próxima cuenta
        ultimoCodigo++;

        // Crear la cuenta con ese ID (por defecto es tipo "A" = Ahorros)
        Cuenta cuentaNueva = new Cuenta(codigoStr);

        // Asignar el cliente recibido como propietario
        cuentaNueva.setPropietario(cliente);

        // Retornar la cuenta ya creada
        return cuentaNueva;
    }

    // MÉTODO DEPOSITAR SEGÚN LO SOLICITADO
    public boolean depositar(double monto, Cuenta cuenta) {
        // Validación: el monto debe ser mayor a 0
        if (monto > 0) {
            // Sumar al saldo actual
            double nuevoSaldo = cuenta.getSaldoActual() + monto;
            cuenta.setSaldoActual(nuevoSaldo);
            return true; // Depósito exitoso
        } else {
            return false; // Monto inválido
        }
    }


    // Getter y Setter
    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }

}
