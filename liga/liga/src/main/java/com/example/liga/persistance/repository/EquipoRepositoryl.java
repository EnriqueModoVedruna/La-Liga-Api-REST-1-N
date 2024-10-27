package com.example.liga.persistance.repository;

import org.springframework.stereotype.Repository;

import com.example.liga.persistance.models.Equipo;
// import com.example.liga.persistance.models.Jugador;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EquipoRepositoryl extends JpaRepository<Equipo, Long> {
    
    Equipo findByIdEquipo(Long idequipo);
    Equipo findByNombre(String nombre);
}
