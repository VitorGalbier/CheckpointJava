package com.example.ClinicaCheckpoint2.persistence.repository.impl;

import com.example.ClinicaCheckpoint2.persistence.Entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPacienteRepository extends JpaRepository <Paciente, Integer> {
}
