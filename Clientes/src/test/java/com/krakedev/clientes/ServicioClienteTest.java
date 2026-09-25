package com.krakedev.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.clientes.entidades.Cliente;
import com.krakedev.clientes.services.ServicioCliente;

public class ServicioClienteTest {
	
    private ServicioCliente servicio;

    @BeforeEach
    void setUp() {
        // Se ejecuta antes de cada prueba para tener un servicio limpio
        servicio = new ServicioCliente();
    }

    @Test
    void testCrearClienteExitoso() {
        Cliente cliente = new Cliente();
        cliente.setCedula("1712345678");
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setEmail("juan.perez@email.com");

        Cliente resultado = servicio.crear(cliente);

        assertNotNull(resultado, "El cliente no debería ser nulo");
        assertEquals("1712345678", resultado.getCedula());
        assertEquals("juan.perez@email.com", resultado.getEmail(), "El email debería coincidir");
        assertEquals(1, servicio.listar().size(), "La lista debería tener 1 cliente");
    }

    @Test
    void testCrearClienteDuplicado() {
        Cliente cliente1 = new Cliente();
        cliente1.setCedula("1712345678");
        cliente1.setNombre("Juan");
        cliente1.setApellido("Perez");
        cliente1.setEmail("juan.perez@email.com");

        Cliente cliente2 = new Cliente();
        cliente2.setCedula("1712345678"); // Misma cédula
        cliente2.setNombre("Maria");
        cliente2.setApellido("Gomez");
        cliente2.setEmail("maria.gomez@email.com");

        servicio.crear(cliente1);
        Cliente resultado = servicio.crear(cliente2);

        assertNull(resultado, "Debería retornar null al intentar crear un duplicado");
        assertEquals(1, servicio.listar().size(), "La lista debería seguir teniendo 1 cliente");
    }

    @Test
    void testBuscarPorCedulaExistente() {
        Cliente cliente = new Cliente();
        cliente.setCedula("1712345678");
        cliente.setNombre("Juan");
        cliente.setEmail("juan.perez@email.com");
        servicio.crear(cliente);

        Cliente encontrado = servicio.buscarPorCedula("1712345678");

        assertNotNull(encontrado);
        assertEquals("Juan", encontrado.getNombre());
        assertEquals("juan.perez@email.com", encontrado.getEmail());
    }

    @Test
    void testBuscarPorCedulaNoExistente() {
        Cliente encontrado = servicio.buscarPorCedula("0000000000");
        assertNull(encontrado, "Debería retornar null si no encuentra la cédula");
    }

    @Test
    void testListarClientes() {
        Cliente cliente1 = new Cliente();
        cliente1.setCedula("1111111111");
        cliente1.setEmail("cliente1@email.com");
        
        Cliente cliente2 = new Cliente();
        cliente2.setCedula("2222222222");
        cliente2.setEmail("cliente2@email.com");

        servicio.crear(cliente1);
        servicio.crear(cliente2);

        List<Cliente> lista = servicio.listar();

        assertEquals(2, lista.size(), "La lista debería tener 2 clientes");
    }

    @Test
    void testActualizarClienteExitoso() {
        // 1. Creamos el cliente original
        Cliente original = new Cliente();
        original.setCedula("1712345678");
        original.setNombre("Juan");
        original.setApellido("Perez");
        original.setEmail("juan.viejo@email.com");
        servicio.crear(original);

        // 2. Creamos el objeto con los datos actualizados
        Cliente actualizado = new Cliente();
        actualizado.setNombre("Juan Carlos");
        actualizado.setApellido("Perez Gomez");
        actualizado.setEmail("juan.nuevo@email.com"); // <-- Nuevo email

        // 3. Ejecutamos la actualización
        Cliente resultado = servicio.actualizar("1712345678", actualizado);

        // 4. Verificamos que TODOS los campos se actualizaron, incluido el email
        assertNotNull(resultado);
        assertEquals("Juan Carlos", resultado.getNombre());
        assertEquals("Perez Gomez", resultado.getApellido());
        assertEquals("juan.nuevo@email.com", resultado.getEmail(), "El email debe haberse actualizado");
        
        // Verificamos que la cédula original no cambió
        assertEquals("1712345678", resultado.getCedula());
    }

    @Test
    void testActualizarClienteNoExistente() {
        Cliente actualizado = new Cliente();
        actualizado.setNombre("Juan Carlos");
        actualizado.setApellido("Perez Gomez");
        actualizado.setEmail("juan.nuevo@email.com");

        Cliente resultado = servicio.actualizar("0000000000", actualizado);

        assertNull(resultado, "Debería retornar null si el cliente a actualizar no existe");
    }

    @Test
    void testEliminarClienteExitoso() {
        Cliente cliente = new Cliente();
        cliente.setCedula("1712345678");
        cliente.setEmail("juan.perez@email.com");
        servicio.crear(cliente);

        boolean resultado = servicio.eliminar("1712345678");

        assertTrue(resultado, "Debería retornar true al eliminar un cliente existente");
        assertEquals(0, servicio.listar().size(), "La lista debería quedar vacía");
    }

    @Test
    void testEliminarClienteNoExistente() {
        boolean resultado = servicio.eliminar("0000000000");

        assertFalse(resultado, "Debería retornar false al intentar eliminar un cliente que no existe");

    }
}