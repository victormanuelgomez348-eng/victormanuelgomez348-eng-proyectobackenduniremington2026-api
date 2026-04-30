package com.proyectobbackenduniremington2026.controller;

import com.proyectobbackenduniremington2026.service.IndicadorService;
import com.proyectobbackenduniremington2026.model.IndicadorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/indicadores")
@CrossOrigin(origins = "*")
public class IndicadorController {

    @Autowired
    private IndicadorService indicadorService;

    @GetMapping("/dashboard")
    public ResponseEntity<Map<String, Object>> getDashboard() {
        return ResponseEntity.ok(indicadorService.getDashboardCompleto());
    }

    @GetMapping("/impacto-social")
    public List<IndicadorDTO> getImpacto() {
        return List.of(
            new IndicadorDTO("Total Beneficiarios", 1250L),
            new IndicadorDTO("Casos Atendidos", 840L),
            new IndicadorDTO("Cobertura Territorial (Municipios)", 12L),
            new IndicadorDTO("Horas de Participación", 4500L)
        );
    }
}