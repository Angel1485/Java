package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Maquina;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para el método servirCerveza de la clase Maquina
 * Ajustada a la regla: llenado hasta capacidad máxima - 200 ml
 */
public class TestServirCervezaAI {

    private static final double TOLERANCIA = 0.001;

    /**
     * Caso 1: Servir una cantidad exacta disponible
     * Capacidad: 2000 ml → Llenado: 1800 ml
     */
    @Test
    public void testServirCantidadExactaDisponible() {
        Maquina maquina = new Maquina("01","IPA", "Cerveza artesanal amarga", 0.05, 2000);
        maquina.llenarMaquina(); // CORREGIDO: Queda en 1800 ml (2000 - 200)

        double valorPagar = maquina.servirCerveza(1000);

        assertEquals(50.0, valorPagar, TOLERANCIA); // 1000 * 0.05 = 50
        assertEquals(800, maquina.getCantidadActual(), TOLERANCIA); // CORREGIDO: 1800 - 1000
    }

    /**
     * Caso 2: Servir una cantidad menor a la disponible
     * Capacidad por defecto: 10000 ml → Llenado: 9800 ml
     */
    @Test
    public void testServirCantidadMenorDisponible() {
        Maquina maquina = new Maquina("02","Lager", "Cerveza suave y dorada", 0.03);
        maquina.llenarMaquina(); // CORREGIDO: Queda en 9800 ml (10000 - 200)

        double valorPagar = maquina.servirCerveza(500);

        assertEquals(15.0, valorPagar, TOLERANCIA); // 500 * 0.03 = 15
        assertEquals(9300, maquina.getCantidadActual(), TOLERANCIA); // CORREGIDO: 9800 - 500
    }

    /**
     * Caso 3: Intentar servir una cantidad mayor a la disponible
     * Capacidad: 3000 ml → Llenado: 2800 ml
     */
    @Test
    public void testServirCantidadMayorDisponible() {
        Maquina maquina = new Maquina("03","Stout", "Cerveza oscura tostada", 0.06, 3000);
        maquina.llenarMaquina(); // CORREGIDO: Queda en 2800 ml (3000 - 200)

        double valorPagar = maquina.servirCerveza(3500);

        assertEquals(0, valorPagar, TOLERANCIA);
        assertEquals(2800, maquina.getCantidadActual(), TOLERANCIA); // CORREGIDO: sin cambios
    }

    /**
     * Caso 4: Servir cuando la máquina está vacía
     */
    @Test
    public void testServirMaquinaVacia() {
        Maquina maquina = new Maquina("04","Pilsen", "Cerveza ligera", 0.04);

        double valorPagar = maquina.servirCerveza(100);

        assertEquals(0, valorPagar, TOLERANCIA);
        assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso 5: Servir la totalidad del stock disponible
     * Capacidad: 2000 ml → Llenado: 1800 ml
     */
    @Test
    public void testServirTodoStockDisponible() {
        Maquina maquina = new Maquina("05","Trigo", "Cerveza con trigo y cítricos", 0.04, 2000);
        maquina.llenarMaquina(); // CORREGIDO: Queda en 1800 ml

        double valorPagar = maquina.servirCerveza(1800); // CORREGIDO: cantidad total disponible

        assertEquals(72.0, valorPagar, TOLERANCIA); // CORREGIDO: 1800 * 0.04 = 72
        assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso 6: Servir cantidad cero
     * Capacidad: 4000 ml → Llenado: 3800 ml
     */
    @Test
    public void testServirCantidadCero() {
        Maquina maquina = new Maquina("06","Amber Ale", "Cerveza ámbar balanceada", 0.05, 4000);
        maquina.llenarMaquina(); // CORREGIDO: Queda en 3800 ml (4000 - 200)

        double valorPagar = maquina.servirCerveza(0);

        assertEquals(0, valorPagar, TOLERANCIA);
        assertEquals(3800, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso 7: Servir una cantidad muy pequeña
     * Capacidad: 6000 ml → Llenado: 5800 ml
     */
    @Test
    public void testServirCantidadPequena() {
        Maquina maquina = new Maquina("07","Roja", "Cerveza con caramelo", 0.025, 6000); // CORREGIDO: código único
        maquina.llenarMaquina(); // CORREGIDO: Queda en 5800 ml (6000 - 200)

        double valorPagar = maquina.servirCerveza(15.5);

        assertEquals(0.3875, valorPagar, TOLERANCIA);
        assertEquals(5784.5, maquina.getCantidadActual(), TOLERANCIA); // CORREGIDO: 5800 - 15.5
    }
}
