package com.krakedev.artesanal.testJUnit;

import com.krakedev.artesanal.Maquina;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestLlenarJUnit {
    @Test
    public void testLlenarMaquina(){
        Maquina rubia = new Maquina("01","Pilsener", "Cerveza", 0.02, 8000);
        rubia.llenarMaquina();
        //Parametros: 1 Lo que se espera que se recargue ; 2: Lo real que se carga, 3:Margen de error
        assertEquals(7900, rubia.getCantidadActual(), 0.001);
    }
}



