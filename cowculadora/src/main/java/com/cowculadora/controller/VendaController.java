package com.cowculadora.controller;

import com.cowculadora.model.Venda;
import com.cowculadora.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendas")
@CrossOrigin(origins = "http://localhost:3000")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> findAll() {
        return vendaService.findAll();
    }

    @PostMapping
    public Venda save(@RequestBody Venda venda) {
        return vendaService.save(venda);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        vendaService.delete(id);
    }
}