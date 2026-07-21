package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        // Crear objeto
        Producto prod = new Producto("Laptop", 800);

        // Probar setPrecio con valor negativo
        prod.setPrecio(-950);
        System.out.println("Precio después de setPrecio(-950): " + prod.getPrecio());

        // Probar descuento del 15%
        double precioPromo = prod.calcularPrecioPromo(15);
        System.out.println("Precio con 15% de descuento: " + precioPromo);
    }
}
