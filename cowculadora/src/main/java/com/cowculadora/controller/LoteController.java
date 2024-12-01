package com.cowculadora.controller;

import com.cowculadora.model.Lote;
import com.cowculadora.service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lotes")
@CrossOrigin(origins = "http://localhost:3000")
public class LoteController {

    @Autowired
    private LoteService loteService;

    @GetMapping
    public List<Lote> findAll() {
        return loteService.findAll();
    }

    @PostMapping
    public Lote save(@RequestBody Lote lote) {
        return loteService.save(lote);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        loteService.delete(id);
    }
}