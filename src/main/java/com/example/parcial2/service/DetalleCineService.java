package com.example.parcial2.service;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.repository.DetalleCineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineService {

    @Autowired
    private DetalleCineRepository detalleCineRepository;

    public DetalleCine guardarDetalle(DetalleCine detalle) throws Exception {
        try {
            return this.detalleCineRepository.save(detalle);
        } catch (Exception error) {
            throw new Exception("Error al guardar el detalle: " + error.getMessage());
        }
    }
}
