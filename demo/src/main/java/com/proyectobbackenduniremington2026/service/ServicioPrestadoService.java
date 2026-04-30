package com.proyectobbackenduniremington2026.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectobbackenduniremington2026.model.ServicioPrestado;
import com.proyectobbackenduniremington2026.repository.ServicioPrestadoRepository;

@Service
public class ServicioPrestadoService {

    @Autowired
    private ServicioPrestadoRepository repository;

    public ServicioPrestado guardarServicio(ServicioPrestado servicio) {
        return repository.save(servicio);
    }

    public List<ServicioPrestado> obtenerTodos() {
        return repository.findAll();
    }

    public List<ServicioPrestado> buscarPorDocumento(String documento) {
        return repository.findByBeneficiarioDocumento(documento);
    }
}