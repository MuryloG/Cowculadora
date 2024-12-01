package com.cowculadora.controller;

import com.cowculadora.model.Medicamento;
import com.cowculadora.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
@CrossOrigin(origins = "http://localhost:3000")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> findAll() {
        return medicamentoService.findAll();
    }

    @PostMapping
    public Medicamento save(@RequestBody Medicamento medicamento) {
        return medicamentoService.save(medicamento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        medicamentoService.delete(id);
    }
}