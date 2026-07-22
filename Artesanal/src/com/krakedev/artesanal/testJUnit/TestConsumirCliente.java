package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestConsumirCliente {

    @Test
    public void probarConsumo() {

        Maquina maquinaA = new Maquina("Pilsener", "Rubia", "Cerveza Fria", 0.002, 8000);
        Negocio barDeMoe = new Negocio("Bar de Moe", maquinaA);
        Cliente cliente = new Cliente("Andres", "123456789");

        barDeMoe.cargarMaquinaA();
        barDeMoe.consumirCervezaMaquinaA(cliente, 100);

        assertEquals(7700, maquinaA.getCantidadActual(),0.001);
        assertEquals(0.2, cliente.getTotalConsumido(),0.001);

        barDeMoe.consumirCervezaMaquinaA(cliente, 200);

        assertEquals(7500, maquinaA.getCantidadActual(),0.001);
        assertEquals(0.6, cliente.getTotalConsumido(),0.001);
    }


}
