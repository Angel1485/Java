package com.biblioteca;

/**
 *
 * @author asarango
 */
public class Libro {
    
     // Atributos
    private int id;
    private String autor;
    private String genero;
    private String titulo;
    private String anio; 
    private String isbn;
    private String editorial;
    private double precio;
    private boolean prestado;

    
    // Constructor vacio 
    public Libro() {
        this.prestado = false; // Por defecto no esta prestado
    }

    // Constructor con parametros
    public Libro(int id, String autor, String titulo, String genero, int anio, double precio) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = String.valueOf(anio);
        this.precio = precio;
        this.prestado = false;
    }

    //Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAnio() { return anio; }
    public void setAnio(String anio) { this.anio = anio; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }

    // Metodo toString 
    @Override
    public String toString() {
        return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + 
               ", genero=" + genero + ", anio=" + anio + ", precio=" + precio + 
               ", prestado=" + prestado + "]";
    }
    
}
