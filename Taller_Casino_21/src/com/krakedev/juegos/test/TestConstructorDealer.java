package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

    public static void main(String[] args) {
        // 1. Instanciar el Dealer
        Dealer dealer = new Dealer();
        
        // 2. Llamar al método imprimirNaipes()
        dealer.imprimirNaipes();
        
        // 3. Verificar cantidad de cartas generadas
        System.out.println("====================================");
        System.out.println("Total de cartas generadas: " + dealer.getNaipes().size());
    }

}
