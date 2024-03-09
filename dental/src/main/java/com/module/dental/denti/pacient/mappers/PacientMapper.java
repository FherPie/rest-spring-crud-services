package com.module.dental.denti.pacient.mappers;


import com.module.dental.pacient.models.PacientDto;
import com.module.dental.denti.pacient.entity.Pacient;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PacientMapper extends EntityMapper<PacientDto, Pacient> {

    @Override
    PacientDto toDto(Pacient entity);

    @Override
    List<PacientDto> toDto(List<Pacient> entityList);

    @Override
    Set<PacientDto> toDto(Set<Pacient> entityList);

    @Override
    Pacient toEntity(PacientDto dto);

    @Override
    List<Pacient> toEntity(List<PacientDto> dtoList);

}


//public interface EntityMapper