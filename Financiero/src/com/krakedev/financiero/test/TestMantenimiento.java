package com.krakedev.financiero.test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.entidades.Direccion;

public class TestMantenimiento {

    public static void main(String[] args) {

        Direccion d = new Direccion();
        Cliente cli = new Cliente ("0105", "Angel", "Sarango" , d);
        System.out.println(d.getCallePrincipal());
        System.out.println(d.getNumero());
        Cuenta c = new Cuenta("01");

    }

}
