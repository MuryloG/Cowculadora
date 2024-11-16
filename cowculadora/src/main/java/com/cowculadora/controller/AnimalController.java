package com.cowculadora.controller;

import com.cowculadora.model.Animal;
import com.cowculadora.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> listar() {
        return animalService.listarTodos();
    }

    @PostMapping
    public Animal criar(@RequestBody Animal animal) {
        return animalService.salvar(animal);
    }
}