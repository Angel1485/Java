package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

    public static void main(String[] args) {

        NegocioMejorado negocio = new NegocioMejorado();
        // Al ejecutar esto saldrá NullPointerException si no esta inicializado el array de caso contarrio funciona
        negocio.registrarCliente("Juan Pérez", "0102030405");
    }

}
