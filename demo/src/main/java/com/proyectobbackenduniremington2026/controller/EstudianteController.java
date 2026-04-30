package com.proyectobbackenduniremington2026.controller;

import com.proyectobbackenduniremington2026.model.Estudiante;
import com.proyectobbackenduniremington2026.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@CrossOrigin(origins = "*")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.obtenerTodos();
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        estudianteService.eliminar(id);
    }
}