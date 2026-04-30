package com.proyectobbackenduniremington2026.controller;

import com.proyectobbackenduniremington2026.model.ServicioPrestado;
import com.proyectobbackenduniremington2026.service.ServicioPrestadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "*")
public class ServicioPrestadoController {

    @Autowired
    private ServicioPrestadoService servicioService; // Verifica que este nombre coincida abajo

    @PostMapping
    public ResponseEntity<ServicioPrestado> crearServicio(@RequestBody ServicioPrestado servicio) {
        return ResponseEntity.ok(servicioService.guardarServicio(servicio));
    }

    @GetMapping
    public List<ServicioPrestado> listarTodos() {
        return servicioService.obtenerTodos();
    }

    @GetMapping("/buscar/{documento}")
    public List<ServicioPrestado> listarPorDocumento(@PathVariable String documento) {
        // Si aquí escribes 'servicioService.buscarPorDocumento', 
        // ese nombre DEBE existir en el archivo del Paso 2.
        return servicioService.buscarPorDocumento(documento);
    }
}