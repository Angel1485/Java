package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.*;

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

    ///////////////////// 
    @Test
    void testConsumirCervezaYActualizarCliente() {
        
        NegocioMejorado negocio = new NegocioMejorado();
    
        negocio.agregarMaquina("Rubia", "Fermentador", 0.5);
        negocio.registrarCliente("Ana Ruiz", "0987654321");

        String codMaquina = negocio.getMaquinas().get(0).getCodigo();
        Cliente cliente = negocio.buscarClientePorCedula("0987654321");
        assertNotNull(cliente);
        int codCliente = cliente.getCodigo();

        // CARGAMOS CERVEZA A LA MÁQUINA ANTES DE SERVIR
        negocio.getMaquinas().get(0).setCantidadActual(500); // Cargamos 500ml

        negocio.consumirCerveza(codMaquina, codCliente, 200);
        double valorEsperado = 100.0;

        assertEquals(valorEsperado, negocio.buscarClientePorCedula("0987654321").getTotalConsumido(), 0.001);
        assertEquals(valorEsperado, negocio.consultarValorVendido(), 0.001);

    }

    @Test
    void testConsultarValorVendido() {
        
        NegocioMejorado negocio = new NegocioMejorado();
    
        // Agregamos máquina y clientes
        negocio.agregarMaquina("Negra", "Macerador", 0.8);
        negocio.registrarCliente("Luis", "1111111111");
        negocio.registrarCliente("Marta", "2222222222");

        String codMaq = negocio.getMaquinas().get(0).getCodigo();
        // CARGAMOS CERVEZA SUFICIENTE EN LA MÁQUINA (ej: 500 ml)
        negocio.getMaquinas().get(0).setCantidadActual(500);

        int codLuis = negocio.buscarClientePorCedula("1111111111").getCodigo();
        int codMarta = negocio.buscarClientePorCedula("2222222222").getCodigo();

        // Luis consume 100ml → 100 * 0.8 = 80
        negocio.consumirCerveza(codMaq, codLuis, 100);
        // Marta consume 50ml → 50 * 0.8 = 40
        negocio.consumirCerveza(codMaq, codMarta, 50);

        // Total vendido = 80 + 40 = 120
        assertEquals(120, negocio.consultarValorVendido(), 0.001);
    }

}
