package com.krakedev.artesanal;

public class Maquina {

    //Nuevo atributo con final: Garantiza que el valor solo se asigna una vez en el constructor y nunca más se puede cambiar, cumpliendo con que sea inmutable.
    private final String codigo; 
    private String nombreCerveza;
    private String descripcion;
    private double precioPorMl;
    private double capacidadMaxima;
    private double cantidadActual;

    public Maquina(String codigo, String nombreCerveza, String descripcion, double precioPorMl, double capacidadMaxima){
        this.codigo = codigo;
        this.nombreCerveza = nombreCerveza;
        this.descripcion = descripcion;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public Maquina(String codigo, String nombreCerveza, String descripcion, double precioPorMl){
        this.codigo = codigo;
        this.nombreCerveza = nombreCerveza;
        this.descripcion = descripcion;
        this.precioPorMl = precioPorMl;
        this.capacidadMaxima = 10000;
        this.cantidadActual = 0;
    }

    public void imprimir() {
        String mensaje;
        mensaje = "Código: " + codigo; // Agregamos el código al listado
        mensaje += "\nNombre cerveza: " + nombreCerveza;
        mensaje += "\nDescripción: " + descripcion;
        mensaje += "\nPrecio por ML: " + precioPorMl;
        mensaje += "\nCapacidad Máxima: " + capacidadMaxima;
        mensaje += "\nCantidad Actual: " + cantidadActual;
        
        System.out.println(mensaje);
    }

    public void llenarMaquina(){
        this.cantidadActual = this.capacidadMaxima - 200; //Cambia de 100 cambia a 200 
    }

    public boolean recargarCerveza(double cantidad) {
        double limitePermitido;
        limitePermitido = capacidadMaxima - 200; //Cambia de 100 cambia a 200 

        if (cantidadActual + cantidad <= limitePermitido) {
            cantidadActual = cantidadActual + cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double servirCerveza(double cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual = cantidadActual - cantidad;
            double valor;
            valor = cantidad * precioPorMl;
            return valor;
        }else{
            return 0;
        }
        
    }

    public String getCodigo() { // Nuevo GETTER que es del codigo
        return codigo;
    }

    public String getNombreCerveza() {
        return nombreCerveza;
    }
    public void setNombreCerveza(String nombreCerveza) {
        this.nombreCerveza = nombreCerveza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public double getPrecioPorMl() {
        return precioPorMl;
    }
    public void setPrecioPorMl(double precioPorMl) {
        this.precioPorMl = precioPorMl;
    }
    public double getCantidadActual() {
        return cantidadActual;
    }
    
}
