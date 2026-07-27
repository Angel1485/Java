package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestVaciar {

    public static void main(String[] args) {
        
        Maquina a = new Maquina("1", "1", "1", 0.02);
        Negocio n = new Negocio("2", a);

        n.getMaquinaA().llenarMaquina();
        n.getMaquinaA().imprimir();
        n.getMaquinaA().servirCerveza(20);
        n.getMaquinaA().imprimir();
        n.getMaquinaA().vaciarMaquina();
        n.getMaquinaA().imprimir();

    }

}
