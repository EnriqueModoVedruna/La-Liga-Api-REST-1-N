package com.example.liga.persistance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.liga.persistance.models.Jugador;
import com.example.liga.services.JugadorServiceI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/liga/jugador")
public class JugadorController {
    
    @Autowired
    private JugadorServiceI jugadorMngmnt;

    @GetMapping
    public List<Jugador> getAllJugadores() {
        return jugadorMngmnt.showAllJugadores();
    }
    
    @GetMapping("/nombre/{nombre}")
    public Jugador mostrarJugadorPornombre(@RequestParam String nombre) {
        return jugadorMngmnt.mostrarJugadorPornombre(nombre);
    }

    @GetMapping("/edad/{edad}")
    public Jugador mostrarJugadorPorEdad(@RequestParam int edad) {
        return jugadorMngmnt.mostrarJugadorPorEdad(edad);
    }

    @GetMapping("/idequipo/{idequipo}")
    public Jugador mostrarJugadorPorIdequipo(@RequestParam Long idequipo) {
        return jugadorMngmnt.encontrarPorIdequipo(idequipo);
    }

    @PostMapping("/insert")
    public String postJugador(@RequestBody Jugador jugador) {        
        jugadorMngmnt.saveJugador(jugador);
        return "Jugador guardado";
    }


    @PutMapping("/edit/{id}")
    public String editJugador(@PathVariable Long id, @RequestBody Jugador jugador) {
        jugadorMngmnt.updateJugador(id, jugador);        
        return "Jugador Modificado";
    }


    @DeleteMapping("delete/{id}")
    public String deleteJugador(@PathVariable Long id){
        jugadorMngmnt.deleteJugador(id);
        return "Jugador Eliminado";
    }   
}
