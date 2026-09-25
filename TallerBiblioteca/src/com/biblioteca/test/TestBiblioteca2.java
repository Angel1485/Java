package com.biblioteca.test;
import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import com.biblioteca.Usuario;

/**
 *
 * @author asarango
 */
public class TestBiblioteca2 {

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println("   SISTEMA DE GESTION DE BIBLIOTECA      ");
        System.out.println("=========================================\n");

        //Inicializar la Biblioteca
        Biblioteca bibliotecaCentral = new Biblioteca();

        //Crear nuevos Libros (Usando el constructor: id, autor, titulo, genero, anio, precio)
        Libro libro1 = new Libro(101, "J.R.R. Tolkien", "El Señor de los Anillos", "Fantasía Épica", 1954, 45.99);
        Libro libro2 = new Libro(102, "Isaac Asimov", "Fundación", "Ciencia Ficción", 1951, 30.50);
        Libro libro3 = new Libro(103, "Jane Austen", "Orgullo y Prejuicio", "Romance", 1813, 22.00);
        Libro libro4 = new Libro(104, "Frank Herbert", "Dune", "Ciencia Ficción", 1965, 40.00);
        Libro libro5 = new Libro(105, "Gabriel García Márquez", "Cien Años de Soledad", "Realismo Mágico", 1967, 35.00);

        //Agregar los libros a la biblioteca (CREATE)
        System.out.println("--- Registrando Libros en el Sistema ---");
        bibliotecaCentral.agregarLibro(libro1);
        bibliotecaCentral.agregarLibro(libro2);
        bibliotecaCentral.agregarLibro(libro3);
        bibliotecaCentral.agregarLibro(libro4);
        bibliotecaCentral.agregarLibro(libro5);

        //Mostrar el catalogo completo
        System.out.println("\n--- Catálogo Completo ---");
        // Al imprimir la lista directamente, se usa el método toString() de Libro
        for (Libro lib : bibliotecaCentral.getLibros()) {
            System.out.println(lib.toString());
        }

        //Crear Usuarios
        Usuario usuarioAna = new Usuario(201, "Ana", "Gómez", "1712345678");
        Usuario usuarioLuis = new Usuario(202, "Luis", "Martínez", "1798765432");

        System.out.println("\n--- Usuarios Registrados ---");
        System.out.println(usuarioAna.toString());
        System.out.println(usuarioLuis.toString());

        //Realizar Préstamos (Lógica de la Biblioteca)
        System.out.println("\n--- Realizando Préstamos ---");
        
        // Ana pide 2 libros
        bibliotecaCentral.prestarLibro(libro1, usuarioAna);
        bibliotecaCentral.prestarLibro(libro4, usuarioAna);
        
        // Luis pide 1 libro
        bibliotecaCentral.prestarLibro(libro2, usuarioLuis);

        // Intentar prestar un libro que ya está prestado (Dune - libro4)
        System.out.println("\n--- Intento de préstamo denegado ---");
        bibliotecaCentral.prestarLibro(libro4, usuarioLuis); 

        //Mostrar disponibilidad actualizada (READ)
        System.out.println("\n--- Libros Disponibles Actualmente ---");
        bibliotecaCentral.mostrarLibrosDisponibles();

        //Mostrar los libros que tiene cada usuario
        System.out.println("\n--- Libros en posesión de Ana ---");
        for (Libro lib : usuarioAna.getLibrosPrestados()) {
            System.out.println("- " + lib.getTitulo());
        }

        //Búsquedas (READ)
        System.out.println("\n--- Búsqueda por cadena: 'Ciencia' ---");
        System.out.println(bibliotecaCentral.buscarPorCadena("Ciencia"));
        
        System.out.println("\n--- Búsqueda por ID (103) ---");
        Libro libroBuscado = bibliotecaCentral.buscarPorId(103);
        if (libroBuscado != null) {
            System.out.println("Encontrado: " + libroBuscado.getTitulo() + " de " + libroBuscado.getAutor());
        } else {
            System.out.println("Libro no encontrado.");
        }

        //Actualizar un Libro (UPDATE)
        System.out.println("\n--- Actualizando precio del libro ID 103 ---");
        bibliotecaCentral.actualizarLibro(103, "Orgullo y Prejuicio (Edición Especial)", 25.99);
        System.out.println("Nuevo estado: " + bibliotecaCentral.buscarPorId(103).toString());

        //Eliminar un Libro (DELETE)
        System.out.println("\n--- Eliminando libro ID 102 (Fundación) ---");
        Libro libroAEliminar = bibliotecaCentral.buscarPorId(102);
        if (libroAEliminar != null) {
            bibliotecaCentral.eliminarLibro(libroAEliminar);
        }

        //Estado final del catálogo
        System.out.println("\n--- Catálogo Final ---");
        for (Libro lib : bibliotecaCentral.getLibros()) {
            System.out.println(lib.toString());
        }
        
        System.out.println("\n=========================================");
        System.out.println("   FIN DE LA PRUEBA DEL SISTEMA          ");
        System.out.println("=========================================");
    
    }
    
}
