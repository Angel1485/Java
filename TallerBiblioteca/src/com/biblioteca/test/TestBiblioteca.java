package com.biblioteca.test;
import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;

/**
 *
 * @author asarango
 */
public class TestBiblioteca {
     public static void main(String[] args) {
        // Crear libros (como en la Imagen 4)
        Libro l1 = new Libro(1, "JJ benitez", "Caballo de troya", "", 2010, 21.00);
        Libro l2 = new Libro(2, "Gabriel Garcia Marquez", "Caballo de troya", "", 2010, 21.0);
        Libro l3 = new Libro(3, "Maria Fernanda Heredia", "Caballo de troya", "", 2010, 21.0);
        Libro l4 = new Libro(4, "Homero", "Caballo de troya", "", 2010, 21.00);
        Libro l5 = new Libro(5, "Benitez", "Caballo de troya", "", 2010, 21.00);

        // Crear la biblioteca
        Biblioteca b1 = new Biblioteca();

        // Agregar libros
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarLibro(l3);
        b1.agregarLibro(l4);
        b1.agregarLibro(l5);

        // Imprimir la lista completa
        System.out.println("Libros: " + b1.getLibros());

        // Buscar por cadena (Ej: "Benitez")
        System.out.println("\n--- Busqueda por cadena 'Benitez' ---");
        System.out.println("Libros encontrados: " + b1.buscarPorCadena("Benitez"));
        
        // Eliminar un registro (Imagen 1)
        System.out.println("\n--- Eliminando libro 2 ---");
        b1.eliminarLibro(l2);
        
        System.out.println("Libros restantes: " + b1.getLibros());
    }
    
}
