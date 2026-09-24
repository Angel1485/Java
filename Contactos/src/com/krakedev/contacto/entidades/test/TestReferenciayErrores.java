package com.krakedev.contacto.entidades.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestReferenciayErrores {

    public static void main(String[] args) {
        
        Directorio dir = new Directorio();
        
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");

        dir.agregarContacto(c1);

        dir.agregarContacto(new Contacto()); // No tiene constructor
        
        Contacto c = dir.obtenerContacto(0);

        System.out.println("Nombre: " + c.getNombre());
    }

}
