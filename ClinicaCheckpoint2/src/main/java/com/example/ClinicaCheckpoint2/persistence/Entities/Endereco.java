package com.example.ClinicaCheckpoint2.persistence.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table (name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name = "id_endereco")
    private Integer id;

    @Column (name = "rua")
    private String rua;

    @Column (name = "numero")
    private String numero;

}
