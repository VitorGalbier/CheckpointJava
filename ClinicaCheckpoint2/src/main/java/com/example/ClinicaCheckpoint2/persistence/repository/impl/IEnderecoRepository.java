package com.example.ClinicaCheckpoint2.persistence.repository.impl;


import com.example.ClinicaCheckpoint2.persistence.Entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnderecoRepository extends JpaRepository <Endereco, Integer> {
}
