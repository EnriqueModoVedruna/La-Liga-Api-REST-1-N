package com.example.liga.persistance.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.CascadeType;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "equipos")
public class Equipo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipo")
    private Long idequipo;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "equipos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Jugador> jugadores;
}
