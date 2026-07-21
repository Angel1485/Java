package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        // Primer objeto
        System.out.println("===== PRIMER PRODUCTO =====");
        Item item1 = new Item();
        item1.setNombre("Camisetas");
        item1.setProductosActuales(20);

        // Valores iniciales
        System.out.println("Valores iniciales:");
        item1.imprimir();

        // Vender 5 unidades
        item1.vender(5);
        System.out.println("Después de vender 5:");
        item1.imprimir();

        // Devolver 2 unidades
        item1.devolver(2);
        System.out.println("Después de devolver 2:");
        item1.imprimir();


        // Segundo objeto
        System.out.println("\n===== SEGUNDO PRODUCTO =====");
        Item item2 = new Item();
        item2.setNombre("Zapatos");
        item2.setProductosActuales(20);

        // Valores iniciales
        System.out.println("Valores iniciales:");
        item2.imprimir();

        // Vender 12 unidades
        item2.vender(12);
        System.out.println("Después de vender 12:");
        item2.imprimir();

        // Devolver 4 unidades
        item2.devolver(4);
        System.out.println("Después de devolver 4:");
        item2.imprimir();
    }
}
