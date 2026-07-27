package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {

     // Atributos solicitados
    private String nickname;
    // Inicializar el ArrayList directamente en la declaración
    private ArrayList<Carta> cartas = new ArrayList<>();
    private int puntajeCartas;


    // Método recibirCarta
    public void recibirCarta(Carta carta) {
        cartas.add(carta);
    }

    // Getters y Setters
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

     public int getPuntajeCartas() {
        return puntajeCartas;
    }
    public void setPuntajeCartas(int puntajeCartas) {
        this.puntajeCartas = puntajeCartas;
    }

}
