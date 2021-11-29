package com.example.ClinicaCheckpoint2.service.impl;

import com.example.ClinicaCheckpoint2.persistence.Entities.Endereco;
import com.example.ClinicaCheckpoint2.persistence.repository.impl.IEnderecoRepository;
import com.example.ClinicaCheckpoint2.service.OdontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements OdontoService <Endereco>{
    @Autowired
    private IEnderecoRepository enderecoRepository;

    @Override
    public Endereco salvar (Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco buscarPorId(Integer id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public void deletar(Integer id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco atualizar(Endereco endereco, Integer id) {
        return null;
    }
}
