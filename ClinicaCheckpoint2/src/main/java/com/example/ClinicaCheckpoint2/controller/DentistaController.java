package com.example.ClinicaCheckpoint2.controller;

import com.example.ClinicaCheckpoint2.persistence.Entities.Dentista;
import com.example.ClinicaCheckpoint2.service.impl.DentistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaServiceImpl dentistaService;

    @PostMapping
    public ResponseEntity<Dentista> salvarDentista(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.salvar(dentista));
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarDentistaPorId(@PathVariable Integer id) {
        Dentista dentista = dentistaService.buscarPorId(id);

        if(dentista != null)
            return ResponseEntity.ok(dentista);

        return ResponseEntity.badRequest().body("Paciente não encontrado");
    }

    @GetMapping("/all")
    public ResponseEntity buscarTodos (){
        return ResponseEntity.ok(dentistaService.buscarTodos());
    }

    @DeleteMapping("/delete/{id}")
    public void deletar (@PathVariable Integer id){
        dentistaService.deletar(id);
    }

    @PutMapping
    public ResponseEntity atualizar (@RequestBody Dentista dentista, @PathVariable Integer id){
        return ResponseEntity.ok(dentistaService.atualizar(dentista, id));
    }

}
