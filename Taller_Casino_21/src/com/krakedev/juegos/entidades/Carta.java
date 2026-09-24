package com.krakedev.juegos.entidades;

public class Carta {

     // Atributos solicitados
    private String valor;
    private int valorJuego;
    private String palo;

    // Getters y Setters para todos los atributos
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public int getValorJuego() {
        return valorJuego;
    }
    public void setValorJuego(int valorJuego) {
        this.valorJuego = valorJuego;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }

    // Método imprimir() solicitado
    public void imprimir() {
        System.out.println("Valor: " + valor + "  Valor en el juego: " + valorJuego + "  Palo: " + palo);
       // System.out.println("Valor en el juego: " + valorJuego);
       // System.out.println("Palo: " + palo);
    }

}
