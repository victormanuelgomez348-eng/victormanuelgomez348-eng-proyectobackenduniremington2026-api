package com.proyectobbackenduniremington2026.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "beneficiarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private int edad;
    private String genero;
    private String municipio;
    private String barrio;
    private String poblacion; 
    private String servicio;
}