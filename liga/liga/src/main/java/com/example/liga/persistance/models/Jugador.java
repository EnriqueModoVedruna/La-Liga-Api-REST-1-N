package com.example.liga.persistance.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "jugadores")
public class Jugador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjugador")
    private Long idjugador;

    @Column(name = "nombre")    
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "equipos_idequipo")
    private Long idequipo;

    @ManyToOne
    @JoinColumn(name = "equipos_idequipo")
    private Equipo equipo;
}
