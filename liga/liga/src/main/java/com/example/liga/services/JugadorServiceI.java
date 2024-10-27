package com.example.liga.services;

import java.util.List;

import com.example.liga.persistance.models.Jugador;

public interface JugadorServiceI {

    List<Jugador> showAllJugadores();
    Jugador mostrarJugadorPornombre(String nombre);
    Jugador mostrarJugadorPorEdad(int edad);
    Jugador encontrarPorIdequipo(Long idequipo);
    Jugador mostrarJugadorPorTodo(Long id, String nombre, int edad, Long idequipo);
    void saveJugador(Jugador jugador);
    void updateJugador(Long id, Jugador jugador);
    void deleteJugador(Long id);
}
