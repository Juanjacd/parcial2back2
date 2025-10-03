package com.example.parcial2.mapper;

import com.example.parcial2.Cine;
import com.example.parcial2.dto.CineDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICineMapper {
    CineDTO convertir_a_dto(Cine cine);
    List<CineDTO> convertir_lista_a_dto(List<Cine> lista);
    Cine convertir_a_entidad(CineDTO dto);
}
