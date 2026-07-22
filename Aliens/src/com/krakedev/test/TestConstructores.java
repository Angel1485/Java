package com.krakedev.test;

import com.krakedev.alien.Alien;

public class TestConstructores {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA 1: Tamaño dentro del rango válido ===");
        Alien alien1 = new Alien(15, "Verde");
        alien1.imprimir();

        System.out.println("=== PRUEBA 2: Tamaño menor al mínimo (3 cm) ===");
        Alien alien2 = new Alien(3, "Azul");
        alien2.imprimir();

        System.out.println("=== PRUEBA 3: Tamaño mayor al máximo (35 cm) ===");
        Alien alien3 = new Alien(35, "Rojo");
        alien3.imprimir();

        System.out.println("=== PRUEBA 4: Tamaño límite inferior (5 cm) ===");
        Alien alien4 = new Alien(5, "Amarillo");
        alien4.imprimir();

        System.out.println("=== PRUEBA 5: Tamaño límite superior (30 cm) ===");
        Alien alien5 = new Alien(30, "Morado");
        alien5.imprimir();
    }
}
