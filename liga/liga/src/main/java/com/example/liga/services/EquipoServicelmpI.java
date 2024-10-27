package com.example.liga.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.liga.persistance.models.Equipo;
import com.example.liga.persistance.models.Jugador;
import com.example.liga.persistance.repository.EquipoRepositoryl;
import com.example.liga.persistance.repository.JugadorRepositoryl;

@Service
public class EquipoServicelmpI implements EquipoServiceI {

    @Autowired
    private EquipoRepositoryl equipoRepo;

    @Override
    public List<Equipo> showAllEquipos() {
        List<Equipo> equipos = equipoRepo.findAll();
        return equipos;
    }

    @Override
    public Equipo encontrarPorNombreEquipo(String nombre) {
        return equipoRepo.findByNombre(nombre);
    }
    @Override
    public void saveEquipo(Equipo equipo) {
        equipoRepo.save(equipo);
    }

    @Override
    public void updateEquipo(Long id, Equipo equipo) {
        equipoRepo.save(equipo);
    }
    @Override
    public void deleteEquipo(Long idequipo) {
        equipoRepo.deleteById(idequipo);
    }

    
}