package com.krakedev.contacto.entidades.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestEliminar {

    public static void main(String[] args) {
        
         Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("0102");

        Contacto c2 = new Contacto();
        c2.setNombre("Juan");
        c2.setCelular("0304");

        Contacto c3 = new Contacto();
        c3.setNombre("Carlos");
        c3.setCelular("0506");

        dir.agregarContacto(c1);
        dir.agregarContacto(c2);
        dir.agregarContacto(c3);

        boolean r1 = dir.eliminarContacto("0102");

        System.out.println("Resultado de Eliminar Contacto 1: " + r1); 

        boolean r2 = dir.eliminarContacto("0304");

        System.out.println("Resultado de Eliminar Contacto 2: " + r2); 

        System.out.println("Cantidad Contactos: " + dir.obtenerCantidadContactos());
    }

}
