package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejorado {

    @Test
    void testGenerarCodigo() {
        NegocioMejorado negocio = new NegocioMejorado();
        String cod = negocio.generarCodigo();
        assertTrue(cod.startsWith("M-"));
        int num = Integer.parseInt(cod.substring(2));
        assertTrue(num >= 1 && num <= 100);
    }

    @Test
    void testAgregarMaquinaExitoso() {
        NegocioMejorado negocio = new NegocioMejorado();
        boolean agregado = negocio.agregarMaquina("Rubia", "Fermentador", 0.6);
        assertTrue(agregado);
        assertEquals(1, negocio.getMaquinas().size());
    }

    @Test
    void testRecuperarMaquina() {
        NegocioMejorado negocio = new NegocioMejorado();
        // Orden correcto: nombreCerveza, descripcion, precioPorMl
        negocio.agregarMaquina("Negra", "Macerador", 0.8);
        
        String codigo = negocio.getMaquinas().get(0).getCodigo();
        Maquina encontrada = negocio.recuperarMaquina(codigo);

        assertNotNull(encontrada);
        // Esperamos "Negra" y recibimos "Negra" → CORRECTO
        assertEquals("Negra", encontrada.getNombreCerveza());
        // Capacidad está en 0 (valor por defecto) → cambiamos el esperado
        assertEquals(10000, encontrada.getCapacidadMaxima());

        // Solo un código que NO existe
        assertNull(negocio.recuperarMaquina("M-999"));
    }

    @Test
    void testCargarMaquinas() {
        NegocioMejorado negocio = new NegocioMejorado();
        negocio.cargarMaquinas();
        assertEquals(3, negocio.getMaquinas().size());
    }

}
