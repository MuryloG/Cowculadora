package com.cowculadora.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataVenda;

    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "lote_id", nullable = false)
    private Lote lote;
}