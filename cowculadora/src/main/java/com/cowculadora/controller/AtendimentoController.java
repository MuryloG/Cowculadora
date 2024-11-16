package com.cowculadora.controller;

import com.cowculadora.model.Atendimento;
import com.cowculadora.service.AtendimentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atendimentos")
public class AtendimentoController {
    private final AtendimentoService atendimentoService;

    public AtendimentoController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping
    public List<Atendimento> listar() {
        return atendimentoService.listarTodos();
    }

    @PostMapping
    public Atendimento criar(@RequestBody Atendimento atendimento) {
        return atendimentoService.salvar(atendimento);
    }
}