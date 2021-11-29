package com.example.ClinicaCheckpoint2.persistence.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table (name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name = "paciente_id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @JoinColumn (name = "endereco")
    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Endereco endereco;

}
