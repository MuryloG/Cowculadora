package com.cowculadora.controller;

import com.cowculadora.model.Atendimento;
import com.cowculadora.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atendimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public List<Atendimento> findAll() {
        return atendimentoService.findAll();
    }

    @PostMapping
    public Atendimento save(@RequestBody Atendimento atendimento) {
        return atendimentoService.save(atendimento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        atendimentoService.delete(id);
    }
}