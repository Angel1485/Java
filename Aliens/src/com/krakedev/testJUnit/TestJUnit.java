package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class TestJUnit {

    // Tolerancia para comparaciones de valores decimales
    private static final double TOLERANCIA = 0.001;

    // PRUEBAS DE ASIGNACIÓN CORRECTA DE ATRIBUTOS
    @Test
    public void testAsignacionAtributos() {
        Alien alien = new Alien(15, "Verde neón");

        assertEquals(15, alien.getTamano(), TOLERANCIA);
        assertEquals("Verde neón", alien.getColor());
    }

    // PRUEBAS DE RESTRICCIONES / LÍMITES DE TAMAÑO
    @Test
    public void testTamanoMenorAlMinimo() {
        Alien alien = new Alien(3, "Azul"); // Menor a 5 cm

        assertEquals(5, alien.getTamano(), TOLERANCIA); // Se ajusta al mínimo
    }

    @Test
    public void testTamanoMayorAlMaximo() {
        Alien alien = new Alien(40, "Rojo"); // Mayor a 30 cm

        assertEquals(30, alien.getTamano(), TOLERANCIA); // Se ajusta al máximo
    }

    @Test
    public void testTamanoLimiteInferior() {
        Alien alien = new Alien(5, "Amarillo"); // Valor exacto mínimo

        assertEquals(5, alien.getTamano(), TOLERANCIA);
    }

    @Test
    public void testTamanoLimiteSuperior() {
        Alien alien = new Alien(30, "Morado"); // Valor exacto máximo

        assertEquals(30, alien.getTamano(), TOLERANCIA);
    }

    // PRUEBAS DE CÁLCULO AUTOMÁTICO DE PRECIOS
    @Test
    public void testCalculoPreciosTamanoNormal() {
        int tamanoPrueba = 20;
        Alien alien = new Alien(tamanoPrueba, "Gris");

        // Precio cuerpo = 20% del tamaño
        double esperadoCuerpo = tamanoPrueba * 0.20;
        // Precio extremidad = 10% del tamaño
        double esperadoExtremidad = tamanoPrueba * 0.10;
        // Precio ojo = 5% del tamaño
        double esperadoOjo = tamanoPrueba * 0.05;

        assertEquals(esperadoCuerpo, alien.getPrecioCuerpo(), TOLERANCIA);
        assertEquals(esperadoExtremidad, alien.getPrecioExtremidad(), TOLERANCIA);
        assertEquals(esperadoOjo, alien.getPrecioOjo(), TOLERANCIA);
    }

    @Test
    public void testCalculoPreciosConAjusteMinimo() {
        // Tamaño ingresado 2 cm → se ajusta a 5 cm
        Alien alien = new Alien(2, "Naranja");

        double esperadoCuerpo = 5 * 0.20;
        double esperadoExtremidad = 5 * 0.10;
        double esperadoOjo = 5 * 0.05;

        assertEquals(esperadoCuerpo, alien.getPrecioCuerpo(), TOLERANCIA);
        assertEquals(esperadoExtremidad, alien.getPrecioExtremidad(), TOLERANCIA);
        assertEquals(esperadoOjo, alien.getPrecioOjo(), TOLERANCIA);
    }

    @Test
    public void testCalculoPreciosConAjusteMaximo() {
        // Tamaño ingresado 35 cm → se ajusta a 30 cm
        Alien alien = new Alien(35, "Violeta");

        double esperadoCuerpo = 30 * 0.20;
        double esperadoExtremidad = 30 * 0.10;
        double esperadoOjo = 30 * 0.05;

        assertEquals(esperadoCuerpo, alien.getPrecioCuerpo(), TOLERANCIA);
        assertEquals(esperadoExtremidad, alien.getPrecioExtremidad(), TOLERANCIA);
        assertEquals(esperadoOjo, alien.getPrecioOjo(), TOLERANCIA);
    }



    // CASOS VÁLIDOS: EXTREMIDADES ==============================================
    @Test
    public void testAgregarBrazosValido() {
        Alien alien = new Alien(15, "Verde");
        boolean resultado = alien.agregarBrazos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroBrazos(), TOLERANCIA);
    }

    @Test
    public void testAgregarPiernasValido() {
        Alien alien = new Alien(20, "Azul");
        boolean resultado = alien.agregarPiernas(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroPatas(), TOLERANCIA);
    }

    // CASOS LÍMITE: Llegar exactamente a 10 extremidades
    @Test
    public void testLimiteExactoBrazos() {
        Alien alien = new Alien(10, "Rojo");
        alien.agregarPiernas(5); // Empieza con 0, queda en 5 piernas
        boolean resultado = alien.agregarBrazos(5); // 5 + 5 = 10

        assertTrue(resultado);
        assertEquals(5, alien.getNumeroBrazos(), TOLERANCIA);
        assertEquals(5, alien.getNumeroPatas(), TOLERANCIA);
    }

    @Test
    public void testExcedeLimite() {
        Alien alien = new Alien(12, "Amarillo");
        alien.agregarBrazos(6); // Queda en 6 brazos
        boolean resultado = alien.agregarPiernas(5); // 6 + 5 = 11 > 10

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroPatas(), TOLERANCIA); // No se agrega nada
    }

    // CASOS COMBINADOS: Agregar brazos y luego piernas
    @Test
    public void testAgregarBrazosYPiernas() {
        Alien alien = new Alien(18, "Morado");
        boolean resBrazos = alien.agregarBrazos(4);
        boolean resPiernas = alien.agregarPiernas(5); // Total: 4 + 5 = 9 ≤ 10

        assertTrue(resBrazos);
        assertTrue(resPiernas);
        assertEquals(4, alien.getNumeroBrazos(), TOLERANCIA);
        assertEquals(5, alien.getNumeroPatas(), TOLERANCIA);
    }

    @Test
    public void testSobrepasaDespuesDeAgregarAmbos() {
        Alien alien = new Alien(25, "Naranja");
        alien.agregarBrazos(6);
        alien.agregarPiernas(3); // Total: 9
        boolean resultado = alien.agregarBrazos(2); // 9 + 2 = 11 > 10

        assertFalse(resultado);
        assertEquals(6, alien.getNumeroBrazos(), TOLERANCIA); // Sin cambios
    }


    // PRUEBAS DE AGREGAR OJOS  ==============================================
    @Test
    public void testLimiteOjosTamano5a10() {
        Alien alien = new Alien(8, "Verde");
        assertTrue(alien.agregarOjos(3)); // Límite máximo 3
        assertFalse(alien.agregarOjos(1)); // Ya llegó al límite
        assertEquals(3, alien.getNumeroOjos());
    }

    @Test
    public void testLimiteOjosTamano11a20() {
        Alien alien = new Alien(15, "Azul");
        assertTrue(alien.agregarOjos(5)); // Límite máximo 5
        assertFalse(alien.agregarOjos(1));
        assertEquals(5, alien.getNumeroOjos());
    }

    @Test
    public void testLimiteOjosTamano21a30() {
        Alien alien = new Alien(28, "Rojo");
        assertTrue(alien.agregarOjos(7)); // Límite máximo 7
        assertFalse(alien.agregarOjos(1));
        assertEquals(7, alien.getNumeroOjos());
    }

    @Test
    public void testOjosPasoAPaso() {
        Alien alien = new Alien(12, "Amarillo");
        assertTrue(alien.agregarOjos(2));
        assertTrue(alien.agregarOjos(2)); // Total 4 ≤5
        assertFalse(alien.agregarOjos(2)); // 4+2=6 >5
        assertEquals(4, alien.getNumeroOjos());
    }

    // PRUEBAS DE PRECIO TOTAL
    @Test
    public void testPrecioTotalInicial() {
        Alien alien = new Alien(10, "Gris");
        // Cuerpo: 10*0.2=2, extremidades 0, ojos 0 → total 2
        assertEquals(2.0, alien.getPrecioTotal(), TOLERANCIA);
    }

    @Test
    public void testPrecioTotalConBrazos() {
        Alien alien = new Alien(10, "Gris");
        alien.agregarBrazos(4);
        // Cuerpo:2 + 4*(10*0.1) = 2+4=6
        assertEquals(6.0, alien.getPrecioTotal(), TOLERANCIA);
    }

    @Test
    public void testPrecioTotalConPiernasYOjos() {
        Alien alien = new Alien(20, "Morado");
        alien.agregarPiernas(3);
        alien.agregarOjos(5);
        // Cuerpo:4 + 3*(2) +5*(1) = 4+6+5=15
        assertEquals(15.0, alien.getPrecioTotal(), TOLERANCIA);
    }

    @Test
    public void testPrecioTotalNoCambiaSiFallaAccion() {
        Alien alien = new Alien(15, "Naranja");
        alien.agregarBrazos(6);
        double precioAntes = alien.getPrecioTotal();
        assertFalse(alien.agregarPiernas(5)); // Falla por límite
        assertEquals(precioAntes, alien.getPrecioTotal(), TOLERANCIA); // No cambia
    }

}
