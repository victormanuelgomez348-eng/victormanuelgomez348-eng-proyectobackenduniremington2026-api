package com.proyectobbackenduniremington2026.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "servicios_prestados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicioPrestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id", nullable = false)
    private Beneficiario beneficiario;

    private String tipoServicio;
    
    private String facultadResponsable;

    @Column(columnDefinition = "TEXT")
    private String descripcionAtencion;

    private String tiempoAtencion;

    private String resultado;

    @Column(columnDefinition = "TEXT")
    private String observaciones;

    private String evidenciasUrl;
}