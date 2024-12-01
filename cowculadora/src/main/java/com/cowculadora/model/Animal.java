package com.cowculadora.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especie;

    private LocalDate dataNascimento;

    private Double peso;

    @ManyToOne
    @JoinColumn(name = "lote_id", nullable = false)
    private Lote lote;
}