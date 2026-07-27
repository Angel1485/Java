package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        
        // PRIMERA PRUEBA: Ejecutar jugar()
        System.out.println("===== PRIMERA PRUEBA =====");
        Juego21 juego = new Juego21();

        Jugador j1 = new Jugador();
        j1.setNickname("Ana");
        Jugador j2 = new Jugador();
        j2.setNickname("Luis");
        Jugador j3 = new Jugador();
        j3.setNickname("Marta");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

        // Asignar valores y ejecutar el juego
        juego.asignarValores();
        ArrayList<Jugador> ganadores = juego.jugar();

        // Mostrar resultado
        if (!ganadores.isEmpty()) {
            for (Jugador g : ganadores) {
                System.out.println("GANADOR: " + g.getNickname() + " - Puntos: " + g.getPuntajeCartas());
            }
        } else {
            System.out.println("Nadie llegó a 21 en las 3 rondas");
        }

        // SEGUNDA PRUEBA: 10 iteraciones completas
        System.out.println("\n===== SEGUNDA PRUEBA =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Partida " + i + " ---");
            // Crear juego nuevo en cada vuelta
            Juego21 juegoNuevo = new Juego21();

            Jugador p1 = new Jugador();
            p1.setNickname("Jugador 1");
            Jugador p2 = new Jugador();
            p2.setNickname("Jugador 2");

            juegoNuevo.agregarJugador(p1);
            juegoNuevo.agregarJugador(p2);
            juegoNuevo.asignarValores();

            ArrayList<Jugador> ganadoresPartida = juegoNuevo.jugar();

            if (!ganadoresPartida.isEmpty()) {
                for (Jugador gan : ganadoresPartida) {
                    System.out.println("Ganador: " + gan.getNickname() + " | Puntos: " + gan.getPuntajeCartas());
                }
            } else {
                System.out.println("Sin ganador en esta partida");
            }
        }
    }

}
