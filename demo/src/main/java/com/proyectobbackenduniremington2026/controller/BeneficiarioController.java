package com.proyectobbackenduniremington2026.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.proyectobbackenduniremington2026.model.Beneficiario;
import com.proyectobbackenduniremington2026.service.BeneficiarioService;

@RestController
@RequestMapping("/api/beneficiarios")
@CrossOrigin(origins = "*")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioService service;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Beneficiario beneficiario) {
        try {
            return ResponseEntity.ok(service.guardar(beneficiario));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public List<Beneficiario> listar() {
        return service.listar();
    }
}