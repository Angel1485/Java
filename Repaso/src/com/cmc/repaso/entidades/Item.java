package com.cmc.repaso.entidades;

public class Item {
    // Atributos solicitados
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // Método imprimir
    public void imprimir() {
        System.out.println("=== Estado del Item ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Productos actuales: " + productosActuales);
        System.out.println("Productos devueltos: " + productosDevueltos);
        System.out.println("Productos vendidos: " + productosVendidos);
        System.out.println("-----------------------");
    }

    // Método vender
    public void vender(int cantidadVendida) {
        this.productosActuales = this.productosActuales - cantidadVendida;
        this.productosVendidos = this.productosVendidos + cantidadVendida;
    }

    // Método devolver
    public void devolver(int cantidadDevuelta) {
        this.productosActuales = this.productosActuales + cantidadDevuelta;
        this.productosVendidos = this.productosVendidos - cantidadDevuelta;
        this.productosDevueltos = this.productosDevueltos + cantidadDevuelta;
    }

    // Setter para asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para asignar productosActuales
    public void setProductosActuales(int cantidad) {
        this.productosActuales = cantidad;
    }
}
