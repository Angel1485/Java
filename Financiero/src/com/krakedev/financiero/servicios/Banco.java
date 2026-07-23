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


    // Getter y Setter
    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }

}
