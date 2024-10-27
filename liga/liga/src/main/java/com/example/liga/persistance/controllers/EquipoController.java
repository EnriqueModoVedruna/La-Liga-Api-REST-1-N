package com.example.liga.persistance.controllers;

import java.util.List;
import com.example.liga.services.EquipoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.liga.persistance.models.Equipo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/liga/equipo")
public class EquipoController {
    
    @Autowired
    private EquipoServiceI equipoMngmnt;

    @GetMapping
    public List<Equipo> getAllEquipos() {
        return equipoMngmnt.showAllEquipos();
    }

    @GetMapping("/nombre/{nombre}")
    public Equipo encontrarPorNombreEquipo(@PathVariable String nombre) {
        return equipoMngmnt.encontrarPorNombreEquipo(nombre);
    }
    
    @PostMapping("/insert")
    public String postEquipo(@RequestBody Equipo equipo) {        
        equipoMngmnt.saveEquipo(equipo);
        return "Equipo guardado";
    }


    @PutMapping("/edit/{id}")
    public String editEquipo(@PathVariable Long id, @RequestBody Equipo equipo) {
        equipoMngmnt.updateEquipo(id, equipo);        
        return "Equipo modificado";
    }


    @DeleteMapping("delete/{id}")
    public String deleteEquipo(@PathVariable Long id){
        equipoMngmnt.deleteEquipo(id);
        return "Equipo eliminado";
    }   
    

}
