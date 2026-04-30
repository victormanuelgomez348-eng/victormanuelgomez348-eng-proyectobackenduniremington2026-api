package com.proyectobbackenduniremington2026.model;

import jakarta.persistence.*; // Esto quita el error de @Entity, @Table e @Id
import lombok.Data;            // Esto quita el error de @Data
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiantes_participantes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCompleto;
    private String codigoEstudiantil;
    private String programaAcademico;
}