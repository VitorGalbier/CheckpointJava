package com.example.ClinicaCheckpoint2.controller;

import com.example.ClinicaCheckpoint2.persistence.Entities.Endereco;
import com.example.ClinicaCheckpoint2.service.impl.EnderecoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoServiceImpl enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereco) {
        return ResponseEntity.ok(enderecoService.salvar(endereco));
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> buscarTodos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Integer id) {
        Endereco endereco = enderecoService.buscarPorId(id);
        if(endereco != null)
            return ResponseEntity.ok(endereco);
        return ResponseEntity.badRequest().body("Endereço não encontrado");
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        enderecoService.deletar(id);
        return "Endereço deletado!";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> atualizar( @RequestBody Endereco endereco, @PathVariable Integer id) {
        return ResponseEntity.ok(enderecoService.atualizar(endereco, id));
    }
}
