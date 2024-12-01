package com.cowculadora.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double ml;

    private double kg;
}