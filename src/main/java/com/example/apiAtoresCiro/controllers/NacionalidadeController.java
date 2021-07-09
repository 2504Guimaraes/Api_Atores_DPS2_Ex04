package com.example.apiAtoresCiro.controllers;

import com.example.apiAtoresCiro.models.Nacionalidade;
import com.example.apiAtoresCiro.services.NacionalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nacionalidades")
public class NacionalidadeController {
    @Autowired
    private NacionalidadeService servico;

    @PostMapping
    public ResponseEntity<Nacionalidade> post(
            @RequestBody Nacionalidade novaN) {
        servico.create(novaN);
        return ResponseEntity.ok(novaN);
    }

    @GetMapping
    public ResponseEntity<List<Nacionalidade>> getAll() {
        return ResponseEntity.ok(
                servico.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        Nacionalidade _n = servico.findById(id);
        if (_n != null)
            return ResponseEntity.ok(_n);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }

    @PutMapping
    public ResponseEntity<?> put(@RequestBody Nacionalidade n) {
        if (servico.update(n))
            return ResponseEntity.ok(n);
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
