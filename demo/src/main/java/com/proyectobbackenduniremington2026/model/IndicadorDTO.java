package com.proyectobbackenduniremington2026.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndicadorDTO {
    private String etiqueta;
    private Long valor;
}