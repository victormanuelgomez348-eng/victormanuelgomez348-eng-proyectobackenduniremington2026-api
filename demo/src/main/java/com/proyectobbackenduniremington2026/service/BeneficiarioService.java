package com.proyectobbackenduniremington2026.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectobbackenduniremington2026.model.Beneficiario;
import com.proyectobbackenduniremington2026.repository.BeneficiarioRepository;

@Service
public class BeneficiarioService {
    @Autowired
    private BeneficiarioRepository repository;

    public Beneficiario guardar(Beneficiario beneficiario) {
        return repository.save(beneficiario);
    }

    public List<Beneficiario> listar() {
        return repository.findAll();
    }
}