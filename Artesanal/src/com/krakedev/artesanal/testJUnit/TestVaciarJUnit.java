package com.krakedev.artesanal.testJUnit;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestVaciarJUnit {

    private Maquina maquina;

    @BeforeEach
    void setUp() {
        maquina = new Maquina("1", "1", "1", 0.02);
    }

    @Test
    void testCrearMaquina() {
        assertNotNull(maquina);
    }

    @Test
    void testLlenarMaquina() {
        maquina.llenarMaquina();

        // Cambia getCantidad() por el getter correspondiente
        assertTrue(maquina.getCantidadActual() > 0);
    }

    @Test
    void testVaciarMaquina() {
        maquina.llenarMaquina();
        maquina.vaciarMaquina();

        assertEquals(0, maquina.getCantidadActual());
    }

    @Test
    void testServirCerveza() {
        maquina.llenarMaquina();

        double antes = maquina.getCantidadActual();

        maquina.servirCerveza(20);

        assertTrue(maquina.getCantidadActual() < antes);
    }

    @Test
    void testImprimirNoEsNull() {
        assertDoesNotThrow(() -> maquina.imprimir());
    }

}
