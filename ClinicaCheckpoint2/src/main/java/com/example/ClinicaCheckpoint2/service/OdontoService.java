package com.example.ClinicaCheckpoint2.service;


import java.util.List;

public interface OdontoService<T> {
    T salvar(T t);
    T buscarPorId(Integer id);
    void deletar (Integer id);
    List<T> buscarTodos ();
    T atualizar (T t, Integer id);
}
