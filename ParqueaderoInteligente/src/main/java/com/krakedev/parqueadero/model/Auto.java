package com.krakedev.parqueadero.model;
public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String placa, String propietario, int numeroPuertas) {
        super(placa, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularTarifa(int horasPermanencia) {
        double total = horasPermanencia * 1.50;
        if (horasPermanencia > 4) {
            total += 2.00; // recargo x estadia prolongada
        }
        return total;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto [placa=" + getPlaca() + ", propietario=" + getPropietario() + ", numeroPuertas=" + numeroPuertas + ", horaIngreso=" + getHoraIngreso() + "]";
    }

}
