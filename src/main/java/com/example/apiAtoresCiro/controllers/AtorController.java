package com.example.apiAtoresCiro.controllers;

import com.example.apiAtoresCiro.models.Ator;
import com.example.apiAtoresCiro.services.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atores")
public class AtorController {
    @Autowired
    private AtorService servico;

    @GetMapping
    public ResponseEntity<List<Ator>> getAll() {
        return ResponseEntity.ok(
                servico.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        Ator _ator = servico.findById(id);
        if (_ator != null)
            return ResponseEntity.ok(_ator);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }

    @PostMapping
    public ResponseEntity<Ator> post(@RequestBody Ator novoAtor) {
        servico.create(novoAtor);
        return ResponseEntity.ok(novoAtor);
    }

    @PutMapping
    public ResponseEntity<?> put(@RequestBody Ator ator) {
        if (servico.update(ator))
            return ResponseEntity.ok(ator);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (servico.delete(id))
            return ResponseEntity.ok().build();
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }
}
