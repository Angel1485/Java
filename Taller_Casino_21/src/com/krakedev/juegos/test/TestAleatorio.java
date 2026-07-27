package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        int rangoMaximo = 10;

        for (int i = 0; i < 10; i++) {
            int numero = dealer.generarAleatorio(rangoMaximo);
            System.out.println("Número generado: " + numero);
            
            // Validación: está entre 0 y el máximo (incluido)
            if (numero < 0 || numero > rangoMaximo) {
                System.out.println("ERROR: valor fuera de rango");
            }
        }
    }

}
