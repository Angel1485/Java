package com.biblioteca.main;
import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import com.biblioteca.Usuario;

/**
 *
 * @author asarango
 */
public class Main {

    public static void main(String[] args) {
        //Instanciar la Biblioteca
        Biblioteca miBiblioteca = new Biblioteca();

        //Crear Libros (Usando el constructor)
        Libro libro1 = new Libro(1, "J.J Benitez", "Caballo de Troya", "Ciencia Ficción", 2010, 21.00);
        Libro libro2 = new Libro(2, "Gabriel Garcia Marquez", "Cien años de soledad", "Realismo Mágico", 1967, 35.50);
        Libro libro3 = new Libro(3, "George Orwell", "1984", "Distopía", 1949, 18.99);

        //Agregar libros a la biblioteca (CREATE)
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);

        //Mostrar libros
        System.out.println("\n--- Catalogo Inicial ---");
        System.out.println(miBiblioteca.getLibros());

        //Crear un Usuario
        Usuario usuario1 = new Usuario(101, "Carlos", "Perez", "1723879662");
        System.out.println("\nUsuario creado: " + usuario1.toString());

        //Realizar un préstamo
        System.out.println("\n--- Realizando Prestamo ---");
        miBiblioteca.prestarLibro(libro1, usuario1); // Deberia prestarse
        miBiblioteca.prestarLibro(libro2, usuario1); // Deberia prestarse
        miBiblioteca.prestarLibro(libro3, usuario1); // Deberia prestarse
        miBiblioteca.prestarLibro(libro1, usuario1); // Error: ya está prestado

        //Mostrar estado final
        System.out.println("\n--- Libros Disponibles ---");
        miBiblioteca.mostrarLibrosDisponibles();

        System.out.println("\n--- Libros del Usuario ---");
        System.out.println(usuario1.getLibrosPrestados());
        
    }
    
}
