package com.proyectobbackenduniremington2026.controller;

import com.proyectobbackenduniremington2026.model.Seguimiento;
import com.proyectobbackenduniremington2026.service.SeguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/seguimientos")
@CrossOrigin(origins = "*")
public class SeguimientoController {

    @Autowired
    private SeguimientoService service;

    @PostMapping
    public ResponseEntity<Seguimiento> guardar(@RequestBody Seguimiento seguimiento) {
        return ResponseEntity.ok(service.guardar(seguimiento));
    }

    @GetMapping
    public List<Seguimiento> listar() {
        return service.listar();
    }

    @GetMapping("/servicio/{servicioId}")
    public List<Seguimiento> listarPorServicio(@PathVariable Long servicioId) {
        return service.listarPorServicio(servicioId);
    }
}