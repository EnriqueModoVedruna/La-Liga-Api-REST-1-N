package com.example.liga.persistance.repository;

import org.springframework.stereotype.Repository;

import com.example.liga.persistance.models.Jugador;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface JugadorRepositoryl extends JpaRepository<Jugador, Long> {
    
    Jugador findByNombre(String nombre);
    Jugador findByIdEquipo(Long idequipo);
    Jugador findByEdad(int edad);
}
