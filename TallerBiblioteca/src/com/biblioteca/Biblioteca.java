package com.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author asarango
 */
public class Biblioteca {
    
    //Atributo: Lista de libros
    private ArrayList<Libro> libros;

    //Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    //Getter y Setter
    public ArrayList<Libro> getLibros() { return libros; }
    public void setLibros(ArrayList<Libro> libros) { this.libros = libros; }

    // ================= CRUD DE LIBROS =================

    // CREATE (Agregar)
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    //Buscar por ID
    public Libro buscarPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; // No encontrado
    }

    // READ (Buscar por Título) 
    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // READ (Buscar por Cadena/Autor)
    public ArrayList<Libro> buscarPorCadena(String cadena) {
        ArrayList<Libro> encontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(cadena.toLowerCase()) || 
                libro.getTitulo().toLowerCase().contains(cadena.toLowerCase())) {
                encontrados.add(libro);
            }
        }
        return encontrados;
    }

    // UPDATE (Actualizar)
    public void actualizarLibro(int id, String nuevoTitulo, double nuevoPrecio) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setPrecio(nuevoPrecio);
            System.out.println("Libro actualizado correctamente.");
        } else {
            System.out.println("Libro no encontrado para actualizar.");
        }
    }

    // DELETE (Eliminar)
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("Libro eliminado: " + libro.getTitulo());
    }

    // ================= LOGICA DE PRESTAMOS =================

    // Método prestar libro 
    public void prestarLibro(Libro libro, Usuario usuario) {
        // Validar que el usuario no tenga más de 3 libros
        if (usuario.getLibrosPrestados().size() >= 3) {
            System.out.println("NO PUEDES PEDIR MAS DE 3 LIBROS");
            return;
        }

        // Buscar el libro en la biblioteca para verificar su estado
        Libro libroEncontrado = buscarPorId(libro.getId());
        
        if (libroEncontrado != null) {
            if (libroEncontrado.isPrestado()) {
                System.out.println("Lo sentimos, el libro '" + libroEncontrado.getTitulo() + "' ya está prestado.");
            } else {
                libroEncontrado.setPrestado(true);
                usuario.tomarLibro(libroEncontrado);
                System.out.println("El libro '" + libroEncontrado.getTitulo() + "' ha sido prestado a " + usuario.getNombre());
            }
        } else {
            System.out.println("El libro no pertenece a esta biblioteca.");
        }
    }

    // Metodo mostrar libros disponibles
    public void mostrarLibrosDisponibles() {
        System.out.println("--- LIBROS DISPONIBLES ---");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println(libro.toString());
            }
        }
    }
    
}
