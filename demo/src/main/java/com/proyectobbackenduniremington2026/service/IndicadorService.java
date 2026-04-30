package com.proyectobbackenduniremington2026.service;

import com.proyectobbackenduniremington2026.repository.ServicioPrestadoRepository;
import com.proyectobbackenduniremington2026.repository.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IndicadorService {

    @Autowired
    private ServicioPrestadoRepository servicioRepo;

    @Autowired
    private BeneficiarioRepository beneficiarioRepo;

    public Map<String, Object> getDashboardCompleto() {
        Map<String, Object> stats = new HashMap<>();
        
        // 1. Número total de beneficiarios
        stats.put("totalBeneficiarios", beneficiarioRepo.count());
        
        // 2. Servicios prestados por facultad
        stats.put("porFacultad", servicioRepo.countByFacultad());
        
        // 3. Casos por resultado (Atendidos vs Remitidos)
        stats.put("porResultado", servicioRepo.countByResultado());
        
        // 4. Cobertura territorial (Municipios)
        stats.put("porCobertura", servicioRepo.countByCobertura());
        
        return stats;
    }
}