package com.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author asarango
 */
public class Usuario {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private int idUsuario;
    
    // Atributo extra para llevar el control de préstamos (Imagen 7)
    private ArrayList<Libro> librosPrestados;

    //Constructores
    public Usuario() {
        this.librosPrestados = new ArrayList<>();
    }

    public Usuario(int idUsuario, String nombre, String apellido, String cedula) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.librosPrestados = new ArrayList<>();
    }

    //Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public ArrayList<Libro> getLibrosPrestados() { return librosPrestados; }

    // Metodo para añadir un libro a su lista de prestados
    public void tomarLibro(Libro libro) {
        this.librosPrestados.add(libro);
    }

    // Metodo para devolver un libro
    public void devolverLibro(Libro libro) {
        this.librosPrestados.remove(libro);
    }

    //toString
    @Override
    public String toString() {
        return "Usuario: nombre=" + nombre + ", apellido=" + apellido + 
               ", cedula=" + cedula + ", idUsuario=" + idUsuario;
    }
    
}
