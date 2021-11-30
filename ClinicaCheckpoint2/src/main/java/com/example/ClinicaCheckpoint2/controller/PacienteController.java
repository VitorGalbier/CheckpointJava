package com.example.ClinicaCheckpoint2.controller;

import com.example.ClinicaCheckpoint2.persistence.Entities.Paciente;
import com.example.ClinicaCheckpoint2.service.impl.PacienteServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private Logger logger = Logger.getLogger(PacienteController.class);

    @Autowired
    private PacienteServiceImpl pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> salvarPaciente(@RequestBody Paciente paciente) {
        logger.info("Salvando Paciente");
        return ResponseEntity.ok(pacienteService.salvar(paciente));
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPacientePorId(@PathVariable Integer id) {
        Paciente paciente = pacienteService.buscarPorId(id);
        logger.info("Buscando Paciente");

        if(paciente != null)
            return ResponseEntity.ok(pacienteService.buscarPorId(id));

        return ResponseEntity.badRequest().body("Paciente não encontrado");
    }

    @GetMapping("/all")
    public ResponseEntity buscarTodos(){
        logger.info("Buscando todos pacientes");
        return ResponseEntity.ok(pacienteService.buscarTodos());
    }

    @DeleteMapping("/delete/{id}")
    public void deletar(@PathVariable Integer id){
        pacienteService.deletar(id);
    }

    @PutMapping ("/atualizar/{id}")
    public ResponseEntity atualizar (@RequestBody Paciente paciente, @PathVariable Integer id){
        logger.info("Atualizando dados do paciente");
        return ResponseEntity.ok(pacienteService.atualizar(paciente, id));
    }

}
