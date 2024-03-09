package com.module.dental.denti.pacient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.module.dental.denti.pacient.entity.Pacient;
import com.module.dental.pacient.models.PacientDto;

@Repository
public interface PacientRepository extends JpaRepository<Pacient, Integer> {

    @Query("select new com.module.dental.pacient.models.PacientDto(p.pacientId, p.pacientNames, p.pacientDni, p.pacientEmail) from Pacient p order by p.id desc")
    List<PacientDto> listPacient();

}
