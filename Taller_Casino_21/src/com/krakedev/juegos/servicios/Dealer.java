package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {

     // Atributo solicitado
    private ArrayList<Carta> naipes;

    // Constructor: instancia el ArrayList y llama a generarNaipes()
    public Dealer() {
        naipes = new ArrayList<>();
        generarNaipes();
    }

    // Getters y Setters
    public ArrayList<Carta> getNaipes() {
        return naipes;
    }
    public void setNaipes(ArrayList<Carta> naipes) {
        this.naipes = naipes;
    }

    

    // Método generarNaipes(): sin parámetros, sin retorno, crea las 52 cartas
    public void generarNaipes() {
        String[] palos = {"T", "CN", "CR", "D"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // Uso de for tradicional como se permite
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                Carta carta = new Carta();
                carta.setValor(valores[j]);
                carta.setPalo(palos[i]);
                // NO se asigna valorJuego aquí (según indicación)
                naipes.add(carta);
            }
        }
    }

    // Método imprimirNaipes(): recorre con for-each y llama a imprimir() de cada carta
    public void imprimirNaipes() {
        for (Carta carta : naipes) {
            carta.imprimir();
            System.out.println("------------------------");
        }
    }

    // Método generarAleatorio():
    public int generarAleatorio(int maximo) {
        return (int) (Math.random() * (maximo + 1));
    }

    // Método entregarCarta():
    public Carta entregarCarta() {
        // 1. Generar posición aleatoria válida
        int posicion = generarAleatorio(naipes.size() - 1);
        // 2. Recuperar la carta
        Carta cartaSeleccionada = naipes.get(posicion);
        // 3. Eliminar del mazo
        naipes.remove(posicion);
        // 4. Devolver la carta
        return cartaSeleccionada;
    }


}
