package com.cowculadora.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    private LocalDate data;
    private String descricao;
    private String medicacao;

    // Getters e Setters
}