package com.example.ClinicaCheckpoint2.service.impl;

import com.example.ClinicaCheckpoint2.persistence.Entities.Dentista;
import com.example.ClinicaCheckpoint2.persistence.repository.impl.IDentistaRepository;
import com.example.ClinicaCheckpoint2.service.OdontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaServiceImpl implements OdontoService<Dentista> {
    @Autowired
    private IDentistaRepository dentistaRepository;



    @Override
    public Dentista salvar(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    @Override
    public Dentista buscarPorId(Integer id) {
        return dentistaRepository.findById(id).get();
    }

    @Override
    public void deletar(Integer id) {
        dentistaRepository.deleteById(id);
    }

    @Override
    public List<Dentista> buscarTodos() {
        return dentistaRepository.findAll();
    }

    @Override
    public Dentista atualizar(Dentista dentista, Integer id) {
        return null;
    }
}
