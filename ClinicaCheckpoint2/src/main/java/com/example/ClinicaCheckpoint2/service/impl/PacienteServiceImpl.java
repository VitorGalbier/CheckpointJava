package com.example.ClinicaCheckpoint2.service.impl;

import com.example.ClinicaCheckpoint2.persistence.Entities.Paciente;
import com.example.ClinicaCheckpoint2.persistence.repository.impl.IEnderecoRepository;
import com.example.ClinicaCheckpoint2.persistence.repository.impl.IPacienteRepository;
import com.example.ClinicaCheckpoint2.service.OdontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements OdontoService<Paciente> {
    @Autowired
    private IPacienteRepository pacienteRepository;
    @Autowired
    private IEnderecoRepository enderecoRepository;


    @Override
    public Paciente salvar(Paciente paciente) {
        enderecoRepository.save(paciente.getEndereco());
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return pacienteRepository.findById(id).get();
    }

    @Override
    public void deletar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente atualizar(Paciente paciente, Integer id) {
        return null;
    }
}
