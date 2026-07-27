package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

    private ArrayList<Jugador> jugadores;
    private Dealer dealer;

    // Constructor
    public Juego21() {
        dealer = new Dealer();
        jugadores = new ArrayList<>();
    }

    // Método agregarJugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método repartirCarta
    public void repartirCarta(Jugador jugador) {
        Carta cartaEntregada = dealer.entregarCarta();
        jugador.recibirCarta(cartaEntregada);
    }

    // Método asignarValores (reglas del 21)
    public void asignarValores() {
        for (int i = 0; i < dealer.getNaipes().size(); i++) {
            Carta c = dealer.getNaipes().get(i);
            String valorCarta = c.getValor();
            int valorNumerico;

            switch (valorCarta) {
                case "A":
                    valorNumerico = 11;
                    break;
                case "J":
                case "Q":
                case "K":
                    valorNumerico = 10;
                    break;
                default:
                    valorNumerico = Integer.parseInt(valorCarta);
                    break;
            }
            c.setValorJuego(valorNumerico);
        }
    }

    // Método imprimirJugador
    public void imprimirJugador(Jugador jugador) {
        System.out.println("Jugador: " + jugador.getNickname());
        for (int i = 0; i < jugador.getCartas().size(); i++) {
            jugador.getCartas().get(i).imprimir();
        }
    }

    // Agregamos repartirRonda 
    public void repartirRonda() {
        for (int i = 0; i < jugadores.size(); i++) {
            repartirCarta(jugadores.get(i));
        }
        calcularTotal(); //Llama al metodo calcular total
    }

    // Agregamos calcularTotal 
    public void calcularTotal() {
        // Recorremos cada jugador con un for
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugadorActual = jugadores.get(i);
            int suma = 0;

            // Sumamos el valorJuego de todas sus cartas
            for (int j = 0; j < jugadorActual.getCartas().size(); j++) {
                suma += jugadorActual.getCartas().get(j).getValorJuego();
            }

            // Guardamos el total en el atributo del jugador
            jugadorActual.setPuntajeCartas(suma);
        }
    }
 
    //Metodo validarGanador()
    public ArrayList<Jugador> validarGanador() {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador j = jugadores.get(i);
            if (j.getPuntajeCartas() == 21) {
                ganadores.add(j);
            }
        }
        return ganadores;
    }

    //Metodo Jugar()
    public ArrayList<Jugador> jugar() {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        // Máximo 3 rondas
        for (int ronda = 1; ronda <= 3; ronda++) {
            // 1. Repartir ronda
            repartirRonda();
            // 2. Buscar ganadores
            ganadores = validarGanador();
            // 3. Si hay ganador(es), terminar
            if (!ganadores.isEmpty()) {
                break;
            }
        }
        // 4. Devolver ganadores
        return ganadores;
    }





    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}
