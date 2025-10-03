package com.example.parcial2.service;

import com.example.parcial2.Sala;
import com.example.parcial2.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public Sala guardarSala(Sala sala) throws Exception {
        try {
            return this.salaRepository.save(sala);
        } catch (Exception error) {
            throw new Exception("Error al guardar la sala: " + error.getMessage());
        }
    }
}
