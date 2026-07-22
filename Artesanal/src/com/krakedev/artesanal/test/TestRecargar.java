package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {
    public static void main(String[] args) {


        boolean resultado;
        Maquina rubia = new Maquina("01","Club","Fria", 0.02, 8000);

        System.out.println("-----------Iniciar---------------");
        rubia.imprimir();

        System.out.println("-----------Recarga 1------------");
        resultado = rubia.recargarCerveza(3000);
        System.err.println("Recargo Correctamente:" + " " + resultado);

        System.out.println("-----------Recarga 2------------");
        resultado = rubia.recargarCerveza(2000);
        System.err.println("Recargo Correctamente:" + " " + resultado);

        System.out.println("-----------Recarga 3------------");
        resultado = rubia.recargarCerveza(2900);
        System.err.println("Recargo Correctamente:" + " " + resultado);

    }

}
