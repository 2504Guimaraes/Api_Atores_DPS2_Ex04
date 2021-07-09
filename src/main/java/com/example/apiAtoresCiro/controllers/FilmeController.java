package com.example.apiAtoresCiro.controllers;

import com.example.apiAtoresCiro.models.Filme;
import com.example.apiAtoresCiro.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeService servico;

    @GetMapping
    public ResponseEntity<List<Filme>> getAll() {
        return ResponseEntity.ok(
                servico.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        Filme _f = servico.findById(id);
        if (_f != null)
            return ResponseEntity.ok(_f);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }

    @PostMapping
    public ResponseEntity<Filme> post(@RequestBody Filme novoF) {
        servico.create(novoF);
        return ResponseEntity.ok(novoF);
    }

    @PutMapping
    public ResponseEntity<?> put(@RequestBody Filme f) {
        if (servico.update(f))
            return ResponseEntity.ok(f);
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
