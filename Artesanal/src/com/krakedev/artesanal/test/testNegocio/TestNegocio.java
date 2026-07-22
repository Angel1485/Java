package com.krakedev.artesanal.test.testNegocio;

import com.krakedev.artesanal.Negocio;
import com.krakedev.artesanal.Maquina;

public class TestNegocio {

    public static void main(String[] args) {

        Maquina nueva = new Maquina("01", "Club", "Cerveza Fina", 0.02,8000);

        Negocio negocio1 = new Negocio("Negocio", nueva);

        System.out.println("Nombre: " + negocio1.getNombre());
        System.out.println("Maquina: " + negocio1.getMaquinaA());

        Maquina m1 = negocio1.getMaquinaA();
        double capacidad = m1.getCapacidadMaxima();


    }

}
