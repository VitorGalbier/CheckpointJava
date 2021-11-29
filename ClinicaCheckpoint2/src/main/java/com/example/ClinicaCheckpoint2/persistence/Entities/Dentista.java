package com.example.ClinicaCheckpoint2.persistence.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table (name = "Dentista")
public class Dentista {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name = "id_dentista")
    private Integer id;

    @Column (name = "numMatricula")
    private Integer numMatricula;

    @Column (name = "nome")
    private String nome;

    @Column (name = "sobrenome")
    private String sobrenome;

}
