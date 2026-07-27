package com.krakedev.contacto.entidades.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestJUnit {

    private Directorio dir;
    private Contacto c1;
    private Contacto c2;
    private Contacto c3;

    @BeforeEach
    void setUp() {
        // Se ejecuta antes de cada prueba: inicializa objetos limpios
        dir = new Directorio();

        c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("0102");

        c2 = new Contacto();
        c2.setNombre("Juan");
        c2.setCelular("01023");

        c3 = new Contacto();
        c3.setNombre("Carlos");
        c3.setCelular("0506");
    }

    @Test
    void agregarContacto_CelularNuevo_RetornaTrueYAumentaCantidad() {
        // Prueba 1: Agregar un contacto con número no registrado
        boolean resultado = dir.agregarContacto(c1);
        
        assertTrue(resultado);
        assertEquals(1, dir.obtenerCantidadContactos());
    }

    @Test
    void agregarContacto_CelularRepetido_RetornaFalseYNoAumentaCantidad() {
        // Prueba 2: No permite agregar el mismo número dos veces
        dir.agregarContacto(c1); // Se agrega primero
        boolean resultadoRepetido = dir.agregarContacto(c1);
        
        assertFalse(resultadoRepetido);
        assertEquals(1, dir.obtenerCantidadContactos());
    }

    @Test
    void agregarContacto_DosNumerosDistintos_AmbosSeAgreganCorrectamente() {
        // Prueba 3: Caso del main que compartiste
        boolean r1 = dir.agregarContacto(c1);
        boolean r2 = dir.agregarContacto(c2);

        assertTrue(r1);
        assertTrue(r2);
        assertEquals(2, dir.obtenerCantidadContactos());
    }

    @Test
    void agregarContacto_VariosContactosSinRepetir_CantidadCorrecta() {
        // Prueba 4: Agregar varios contactos únicos
        dir.agregarContacto(c1);
        dir.agregarContacto(c2);
        dir.agregarContacto(c3);

        assertEquals(3, dir.obtenerCantidadContactos());
    }

}
