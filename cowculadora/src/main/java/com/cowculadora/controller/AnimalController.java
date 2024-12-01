package com.cowculadora.controller;

import com.cowculadora.model.Animal;
import com.cowculadora.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
@CrossOrigin(origins = "http://localhost:3000")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @PostMapping
    public Animal save(@RequestBody Animal animal) {
        return animalService.save(animal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        animalService.delete(id);
    }
}