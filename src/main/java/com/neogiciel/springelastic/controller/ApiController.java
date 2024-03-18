package com.neogiciel.springelastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.neogiciel.springelastic.model.Livre;
import com.neogiciel.springelastic.manager.LivreRepository;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Autowired
    private LivreRepository repository;
    
    @PostMapping
    public Livre create(@RequestBody Livre livre) {
        return repository.save(livre);
    }
    @GetMapping("/{id}")
    public Optional<Livre> findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @GetMapping
    public Iterable<Livre> findAll() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Livre update(@PathVariable String id, @RequestBody Livre livre) {
        livre.setId(id);
        return repository.save(livre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}