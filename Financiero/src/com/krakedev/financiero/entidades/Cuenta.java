package com.krakedev.financiero.entidades;

public class Cuenta {

    // Atributos originales
    private String id;
    private double saldoActual;
    private String tipo;
    // Nuevo atributo por composición
    private Cliente propietario;

    // Constructor original (solo recibe id)
    public Cuenta(String id) {
        this.id = id;
        this.saldoActual = 0;
        this.tipo = "A";
    }

    // Getters y Setters originales
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getSaldoActual() { return saldoActual; }
    public void setSaldoActual(double saldoActual) { this.saldoActual = saldoActual; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    // Getter y Setter para el nuevo atributo
    public Cliente getPropietario() { return propietario; }
    public void setPropietario(Cliente propietario) { this.propietario = propietario; }

    // Método imprimir modificado con datos del cliente
    public void imprimir() {
        System.out.println("=== Datos de la Cuenta ===");
        System.out.println("ID: " + id);
        System.out.println("Saldo Actual: $" + saldoActual);
        System.out.println("Tipo: " + (tipo.equals("A") ? "Ahorros" : "Corriente"));
        
        // Mostramos los datos del propietario si está asignado
        if (propietario != null) {
            System.out.println("--- Datos del Propietario ---");
            System.out.println("Cédula del cliente: " + propietario.getCedula());
            System.out.println("Nombre del cliente: " + propietario.getNombre() + " " + propietario.getApellido());
        } else {
            System.out.println("Propietario: No asignado");
        }
    }

}
