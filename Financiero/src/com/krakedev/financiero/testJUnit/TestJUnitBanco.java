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

    //////////PRUEBAS RETIRAR

     @Test
    void testRetirar_MontoValidoMenorSaldo_Exito() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0104444444", "Pedro", "Cruz");
        Cuenta cuenta = banco.crearCuenta(cli);
        banco.depositar(1000, cuenta); // Saldo inicial $1000

        boolean resultado = banco.retirar(300, cuenta);

        assertTrue(resultado);
        assertEquals(700, cuenta.getSaldoActual(), 0.001);
    }

    @Test
    void testRetirar_MontoIgualSaldo_Exito() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0105555555", "Sofía", "Reyes");
        Cuenta cuenta = banco.crearCuenta(cli);
        banco.depositar(500, cuenta);

        boolean resultado = banco.retirar(500, cuenta);

        assertTrue(resultado);
        assertEquals(0, cuenta.getSaldoActual());
    }

    @Test
    void testRetirar_MontoCero_Falla() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0106666666", "Diego", "Mora");
        Cuenta cuenta = banco.crearCuenta(cli);
        banco.depositar(200, cuenta);

        boolean resultado = banco.retirar(0, cuenta);

        assertFalse(resultado);
        assertEquals(200, cuenta.getSaldoActual());
    }

    @Test
    void testRetirar_MontoNegativo_Falla() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0107777777", "Luz", "Vega");
        Cuenta cuenta = banco.crearCuenta(cli);
        banco.depositar(300, cuenta);

        boolean resultado = banco.retirar(-50, cuenta);

        assertFalse(resultado);
        assertEquals(300, cuenta.getSaldoActual());
    }

    @Test
    void testRetirar_MontoSuperaSaldo_Falla() {
        Banco banco = new Banco();
        Cliente cli = new Cliente("0108888888", "Jorge", "Paz");
        Cuenta cuenta = banco.crearCuenta(cli);
        banco.depositar(250, cuenta);

        boolean resultado = banco.retirar(300, cuenta);

        assertFalse(resultado);
        assertEquals(250, cuenta.getSaldoActual());
    }

    //////////PRUEBAS TRANSFERIR
    
     @Test
    void testTransferir_OperacionExitosa() {
        Banco banco = new Banco();
        Cliente cli1 = new Cliente("0101111111", "Juan", "Pérez");
        Cliente cli2 = new Cliente("0102222222", "Ana", "Gómez");
        
        Cuenta cuentaOrigen = banco.crearCuenta(cli1);
        Cuenta cuentaDestino = banco.crearCuenta(cli2);
        banco.depositar(1000, cuentaOrigen); // Saldo origen: 1000

        boolean resultado = banco.transferir(300, cuentaOrigen, cuentaDestino);

        assertTrue(resultado);
        assertEquals(700, cuentaOrigen.getSaldoActual(), 0.001);
        assertEquals(300, cuentaDestino.getSaldoActual(), 0.001);
    }

    @Test
    void testTransferir_MontoSuperaSaldoOrigen_Falla() {
        Banco banco = new Banco();
        Cliente cli1 = new Cliente("0103333333", "Luis", "Ruiz");
        Cliente cli2 = new Cliente("0104444444", "Sofía", "Mora");
        
        Cuenta cuentaOrigen = banco.crearCuenta(cli1);
        Cuenta cuentaDestino = banco.crearCuenta(cli2);
        banco.depositar(200, cuentaOrigen);

        boolean resultado = banco.transferir(500, cuentaOrigen, cuentaDestino);

        assertFalse(resultado);
        assertEquals(200, cuentaOrigen.getSaldoActual());
        assertEquals(0, cuentaDestino.getSaldoActual());
    }

    @Test
    void testTransferir_MontoNegativo_Falla() {
        Banco banco = new Banco();
        Cliente cli1 = new Cliente("0105555555", "Carlos", "Vega");
        Cliente cli2 = new Cliente("0106666666", "María", "Cruz");
        
        Cuenta cuentaOrigen = banco.crearCuenta(cli1);
        Cuenta cuentaDestino = banco.crearCuenta(cli2);
        banco.depositar(500, cuentaOrigen);

        boolean resultado = banco.transferir(-100, cuentaOrigen, cuentaDestino);

        assertFalse(resultado);
        assertEquals(500, cuentaOrigen.getSaldoActual());
        assertEquals(0, cuentaDestino.getSaldoActual());
    }
}
