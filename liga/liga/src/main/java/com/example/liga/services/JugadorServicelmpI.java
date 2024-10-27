package com.example.liga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.liga.persistance.models.Jugador;
import com.example.liga.persistance.repository.JugadorRepositoryl;
@Service
public class JugadorServicelmpI implements JugadorServiceI{
    
    @Autowired
    private JugadorRepositoryl jugadorRepo;
    
    @Override
    public List<Jugador> showAllJugadores() {
        return jugadorRepo.findAll();
    }

    @Override
    public Jugador mostrarJugadorPornombre(String nombre) {
        return jugadorRepo.findByNombre(nombre);
    }

    @Override
    public Jugador mostrarJugadorPorEdad(int edad) {
        return jugadorRepo.findByEdad(edad);
    }

    @Override
    public Jugador encontrarPorIdequipo(Long idequipo) {
        return jugadorRepo.findByIdEquipo(idequipo);
    }

    @Override
    public Jugador mostrarJugadorPorTodo(Long id, String nombre, int edad, Long idequipo) {
        return jugadorRepo.findByIdEquipo(idequipo);
    }
    
    @Override
    public void saveJugador(Jugador jugador) {
        jugadorRepo.save(jugador);
    }

    @Override
    public void updateJugador(Long id, Jugador jugador) {
        jugadorRepo.save(jugador);
    }

    @Override
    public void deleteJugador(Long id) {
        jugadorRepo.deleteById(id); 
    }
}
