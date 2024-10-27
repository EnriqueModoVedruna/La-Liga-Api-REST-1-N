package com.example.liga.services;

import java.util.List;

import com.example.liga.persistance.models.Equipo;

public interface EquipoServiceI {
    List<Equipo> showAllEquipos();
    // Equipo encontrarPorIdequipo(Long idequipo);
    Equipo encontrarPorNombreEquipo(String nombre);
    void saveEquipo(Equipo equipo);
    void updateEquipo(Long id, Equipo equipo);
    void deleteEquipo(Long idequipo);
}
