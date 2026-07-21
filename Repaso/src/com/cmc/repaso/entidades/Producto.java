package com.cmc.repaso.entidades;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor 
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método setPrecio solicitado
    public void setPrecio(double valorRecibido) {
        // Validar si es positivo
        if (valorRecibido > 0) {
            this.precio = valorRecibido;
        } else {
            // Si es negativo: multiplicar por -1 para volverlo positivo
            this.precio = valorRecibido * (-1);
        }
    }

    // Método calcularPrecioPromo
    public double calcularPrecioPromo(double porcentajeDescuento) {
        double descuento = this.precio * (porcentajeDescuento / 100);
        return this.precio - descuento;
    }

    // Getters para probar
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}
