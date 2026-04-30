package com.proyectobbackenduniremington2026.repository;

import com.proyectobbackenduniremington2026.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // Puedes agregar búsquedas personalizadas aquí, por ejemplo por código
    Estudiante findByCodigoEstudiantil(String codigoEstudiantil);
}