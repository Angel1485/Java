package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
    public static void main(String[] args) {
        // Instanciamos con el constructor de la clase producto
        Producto producto1 = new Producto(101, "Laptop Gamer");

        // Asignar valores a descripción y peso
        producto1.setDescripcion("Laptop con procesador Intel i7 y 16GB RAM");
        producto1.setPeso(2.3);

        // Imprimir los valores en consola
        System.out.println("=== DATOS DEL PRODUCTO ===");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Descripción: " + producto1.getDescripcion());
        System.out.println("Peso: " + producto1.getPeso() + " kg");
    }
}
