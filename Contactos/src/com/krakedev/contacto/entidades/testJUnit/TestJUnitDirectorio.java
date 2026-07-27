package com.krakedev.contacto.entidades.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.contacto.entidades.*;

public class TestJUnitDirectorio {

    // Prueba: buscarContacto - número existente
    @Test
    void buscarContacto_CuandoExiste_DevuelveContacto() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("0987654321");
        dir.agregarContacto(c1);

        Contacto resultado = dir.buscarContacto("0987654321");
        assertNotNull(resultado);
        assertEquals("Maria", resultado.getNombre());
    }

    // Prueba: buscarContacto - número no existente
    @Test
    void buscarContacto_CuandoNoExiste_DevuelveNull() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0912345678");
        dir.agregarContacto(c1);

        Contacto resultado = dir.buscarContacto("0000000000");
        assertNull(resultado);
    }

    // Prueba: eliminarContacto - contacto existente
    @Test
    void eliminarContacto_CuandoExiste_DevuelveTrueYLoQuita() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Carlos");
        c1.setCelular("0998765432");
        dir.agregarContacto(c1);

        boolean eliminado = dir.eliminarContacto("0998765432");
        assertTrue(eliminado);
        assertEquals(0, dir.obtenerCantidadContactos());
    }

    // Prueba: eliminarContacto - contacto no existente
    @Test
    void eliminarContacto_CuandoNoExiste_DevuelveFalse() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Ana");
        c1.setCelular("0976543210");
        dir.agregarContacto(c1);

        boolean eliminado = dir.eliminarContacto("0000000000");
        assertFalse(eliminado);
        assertEquals(1, dir.obtenerCantidadContactos());
    }

    // Prueba: buscarContactosCoincidencia - hay coincidencias
    @Test
    void buscarContactosCoincidencia_CuandoHayCoincidencias_DevuelveListaCorrecta() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("María");
        c1.setCelular("0911111111");
        Contacto c2 = new Contacto();
        c2.setNombre("Marcos");
        c2.setCelular("0922222222");
        Contacto c3 = new Contacto();
        c3.setNombre("Pedro");
        c3.setCelular("0933333333");
        dir.agregarContacto(c1);
        dir.agregarContacto(c2);
        dir.agregarContacto(c3);

        var resultados = dir.buscarContactosCoincidencia("Mar");
        assertEquals(2, resultados.size());
    }

    // Prueba: buscarContactosCoincidencia - sin coincidencias
    @Test
    void buscarContactosCoincidencia_CuandoNoHayCoincidencias_DevuelveListaVacia() {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Luis");
        c1.setCelular("0944444444");
        dir.agregarContacto(c1);

        var resultados = dir.buscarContactosCoincidencia("Xyz");
        assertEquals(0, resultados.size());
    }
}
