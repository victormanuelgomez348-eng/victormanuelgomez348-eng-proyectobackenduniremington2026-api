package com.proyectobbackenduniremington2026.service;

import com.proyectobbackenduniremington2026.model.Estudiante;
import com.proyectobbackenduniremington2026.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}