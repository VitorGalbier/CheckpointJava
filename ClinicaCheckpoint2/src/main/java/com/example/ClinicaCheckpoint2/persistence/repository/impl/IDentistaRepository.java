package com.example.ClinicaCheckpoint2.persistence.repository.impl;

import com.example.ClinicaCheckpoint2.persistence.Entities.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IDentistaRepository extends JpaRepository <Dentista, Integer> {
}
