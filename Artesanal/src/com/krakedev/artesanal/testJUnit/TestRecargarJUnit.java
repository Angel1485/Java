package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {

    @Test
    public void testRecargaExitosa(){
        Maquina rubia = new Maquina("01","Pilsener", "Cerveza", 0.02, 8000);

        boolean resultado = rubia.recargarCerveza(3000);
        assertTrue(resultado);
        //Parametros: 1 Lo que se espera que se recargue ; 2: Lo real que se carga, 3:Margen de error
        assertEquals(3000, rubia.getCantidadActual(), 0.001);
    }

    @Test
    public void testRecargaFallidaPorDesborde(){
        Maquina negra = new Maquina("02","Club", "Cerveza Fria", 0.03, 8000);

        negra.recargarCerveza(7000);
        boolean resultado = negra.recargarCerveza(1000);
        assertTrue(resultado);
        //Parametros: 1 Lo que se espera que se recargue ; 2: Lo real que se carga, 3:Margen de error
        assertEquals(3000, negra.getCantidadActual(), 0.001);
    }
}
