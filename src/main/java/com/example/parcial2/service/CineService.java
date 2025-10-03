package com.example.parcial2.service;

import com.example.parcial2.Cine;
import com.example.parcial2.dto.CineDTO;
import com.example.parcial2.mapper.ICineMapper;
import com.example.parcial2.repository.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineService {

    @Autowired
    private CineRepository cineRepository;

    @Autowired
    private ICineMapper cineMapper;

    public CineDTO guardarCine(Cine cine) throws Exception {
        try {
            return this.cineMapper.convertir_a_dto(this.cineRepository.save(cine));
        } catch (Exception error) {
            throw new Exception("Error al guardar el cine: " + error.getMessage());
        }
    }
}
