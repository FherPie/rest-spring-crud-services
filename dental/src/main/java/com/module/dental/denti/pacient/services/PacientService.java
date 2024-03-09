package com.module.dental.denti.pacient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.module.dental.denti.pacient.entity.Pacient;
import com.module.dental.denti.pacient.mappers.PacientMapper;
import com.module.dental.denti.pacient.repository.PacientRepository;
import com.module.dental.pacient.models.PacientDto;



@Service
@Transactional
public class PacientService {

    @Autowired
    private PacientRepository repositoryPacient;

    @Autowired
    private PacientMapper pacientMapper;



    public PacientDto saveP(PacientDto pacientDto){
        return pacientMapper.toDto(repositoryPacient.save(pacientMapper.toEntity(pacientDto)));
    }


    public List<PacientDto> findAll() {
        return repositoryPacient.listPacient();
    }


    
    public PacientDto getByIdPacient(Integer pacientId){
        Pacient pacient=repositoryPacient.findById(pacientId).get();
        return pacientMapper.toDto(pacient);
    }


    public PacientDto updateP(PacientDto pacientDto){

        return null;
    }

    public PacientDto deleteP(PacientDto pacientDto){

        return null;
    }


    public PacientDto serviceP(PacientDto pacientDto){

        return null;
    }


    public void deleteP(Integer id) {
       repositoryPacient.deleteById(id);
    }


}
