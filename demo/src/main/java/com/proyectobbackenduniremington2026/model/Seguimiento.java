package com.proyectobbackenduniremington2026.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "seguimientos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seguimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "servicio_id", nullable = false)
    private ServicioPrestado servicio;

    private LocalDate fechaSeguimiento;
    private String estado;
    private String observaciones;
    private String accionesTomadas;
}