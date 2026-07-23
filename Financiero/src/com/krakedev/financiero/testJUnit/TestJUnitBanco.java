package com.krakedev.financiero.testJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.servicios.Banco;

public class TestJUnitBanco {

    ///////////PRUEBAS CERAR CUENTA
     @Test
    void testCrearCuenta_CodigosConsecutivos() {
        // Preparar objetos
        Banco banco = new Banco();
        Cliente clientePrueba = new Cliente("0100000001", "Prueba", "JUnit");

        // Crear varias cuentas
        Cuenta cuenta1 = banco.crearCuenta(clientePrueba);
        Cuenta cuenta2 = banco.crearCuenta(clientePrueba);
        Cuenta cuenta3 = banco.crearCuenta(clientePrueba);

        // Validar que los códigos sean consecutivos desde 1000
        assertEquals("1000", cuenta1.getId());
        assertEquals("1001", cuenta2.getId());
        assertEquals("1002", cuenta3.getId());
    }

    @Test
    void testCrearCuenta_TipoAhorrosPorDefecto() {
        Banco banco = new Banco();
        Cliente clientePrueba = new Cliente("0100000002", "Prueba", "Tipo");

        Cuenta cuenta = banco.crearCuenta(clientePrueba);

        // Validar que sea tipo "A" (Ahorros)
        assertEquals("A", cuenta.getTipo());
    }

    @Test
    void testCrearCuenta_AsignaClienteCorrectamente() {
        Banco banco = new Banco();
        Cliente clientePrueba = new Cliente("0109999999", "María", "López");

        Cuenta cuenta = banco.crearCuenta(clientePrueba);

        // Validar que el propietario sea el mismo cliente
        assertNotNull(cuenta.getPropietario());
        assertEquals("0109999999", cuenta.getPropietario().getCedula());
        assertEquals("María", cuenta.getPropietario().getNombre());
    }


    //////////PRUEBAS DEPOSITAR
    
     @Test
    void testDepositar_MontoValido_Exito() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0101111111", "Ana", "Ruiz");
        Cuenta cuenta = banco.crearCuenta(cli);

        boolean resultado = banco.depositar(500.75, cuenta);

        assertTrue(resultado);
        assertEquals(500.75, cuenta.getSaldoActual(), 0.001);
    }

    @Test
    void testDepositar_MontoCero_Falla() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0102222222", "Luis", "Soto");
        Cuenta cuenta = banco.crearCuenta(cli);

        boolean resultado = banco.depositar(0, cuenta);

        assertFalse(resultado);
        assertEquals(0, cuenta.getSaldoActual());
    }

    @Test
    void testDepositar_MontoNegativo_Falla() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0103333333", "Marta", "Gómez");
        Cuenta cuenta = banco.crearCuenta(cli);

        boolean resultado = banco.depositar(-100.50, cuenta);

        assertFalse(resultado);
        assertEquals(0, cuenta.getSaldoActual());
    }

}
