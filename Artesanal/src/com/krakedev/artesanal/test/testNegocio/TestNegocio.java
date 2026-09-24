package com.krakedev.artesanal.test.testNegocio;
import com.krakedev.artesanal.NegocioMejorado;
import com.krakedev.artesanal.Maquina;

public class TestNegocio {

    public static void main(String[] args) {

        NegocioMejorado nm =  new NegocioMejorado();
        Maquina nueva = new Maquina(nm.generarCodigo(), "Club", "Cerveza Fina", 0.02, 8000);

        //System.out.println("Antes de llenar: " + nueva.getCantidadActual());

        nueva.llenarMaquina();

        nm.getMaquinas().add(nueva);
        //System.out.println("Después de llenar: " + nueva.getCantidadActual());

       // nm.cargarMaquinas();
        
       // Negocio negocio1 = new Negocio();
        // Negocio negocio1 = new Negocio("Negocio", nueva);
        // System.out.println("Nombre: " + negocio1.getNombre());
        // System.out.println("Maquina: " + negocio1.getMaquinaA());
        // Maquina m1 = negocio1.getMaquinaA(); //Llamamos a la clase maquina
        // double capacidad = m1.getCapacidadMaxima();

         System.out.println(nm.agregarMaquina("Pilsener", "Cerveza", 0.5));
         System.out.println(nm.agregarMaquina("Nevada", "Cerveza", 0.5));
         

        nm.registrarCliente("Angel", "0105");
        nm.registrarCliente("Sarango", "0106");
        nm.registrarCliente("Justin", "0106568932");

        System.out.println("Código Angel: " + nm.buscarClientePorCedula("0105").getCodigo());
        System.out.println("Código Sarango: " + nm.buscarClientePorCedula("0106").getCodigo());
        System.out.println("Código Justin: " + nm.buscarClientePorCedula("0106568932").getCodigo());
        
        System.out.println("Cedula 1: " + nm.buscarClientePorCedula("0105").getCedula());
        System.out.println("Cedula 2: " + nm.buscarClientePorCedula("0106568932").getCedula());

        System.out.println("Código máquina: " + nueva.getCodigo());
        System.out.println("Cantidad actual: " + nueva.getCantidadActual());
        System.out.println("Precio por ML: " + nueva.getPrecioPorMl());


         nm.consumirCerveza(nueva.getCodigo().toString(), 1, 100);
         System.out.println("Total: " +  nm.consultarValorVendido());

         nm.consumirCerveza(nueva.getCodigo().toString(), 2, 200);
         System.out.println("Total: " + nm.consultarValorVendido());

         nm.consumirCerveza(nueva.getCodigo().toString(), 3, 300);
         System.out.println("Total: " + nm.consultarValorVendido());
		 
     }

}
