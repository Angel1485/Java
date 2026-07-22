package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {
    public static void main(String[] args) throws Exception {
        
        Maquina rubia = new Maquina("01","Pilsener","Cerveza Rubia", 0.02, 10000);
        rubia.imprimir();

        System.err.println();
        rubia.setNombreCerveza("Golden Air");
        rubia.setDescripcion("Cerveza con aroma mas intenso");
        rubia.imprimir();
    }
}
