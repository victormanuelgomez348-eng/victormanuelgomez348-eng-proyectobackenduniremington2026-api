package com.proyectobbackenduniremington2026.repository;

import com.proyectobbackenduniremington2026.model.ServicioPrestado;
import com.proyectobbackenduniremington2026.model.IndicadorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServicioPrestadoRepository extends JpaRepository<ServicioPrestado, Long> {

    @Query("SELECT new com.proyectobbackenduniremington2026.model.IndicadorDTO(s.facultadResponsable, COUNT(s)) FROM ServicioPrestado s GROUP BY s.facultadResponsable")
    List<IndicadorDTO> countByFacultad();

    @Query("SELECT new com.proyectobbackenduniremington2026.model.IndicadorDTO(s.resultado, COUNT(s)) FROM ServicioPrestado s GROUP BY s.resultado")
    List<IndicadorDTO> countByResultado();

    @Query("SELECT new com.proyectobbackenduniremington2026.model.IndicadorDTO(b.municipio, COUNT(s)) FROM ServicioPrestado s JOIN s.beneficiario b GROUP BY b.municipio")
    List<IndicadorDTO> countByCobertura();

    List<ServicioPrestado> findByBeneficiarioDocumento(String documento);
    List<ServicioPrestado> findByBeneficiarioId(Long id);
}