package com.example.apiAtoresCiro.services;

import com.example.apiAtoresCiro.models.Filme;
import com.example.apiAtoresCiro.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme create(Filme f) {
        repository.save(f);
        return f;
    }

    public Filme findById(Long id) {
        Optional<Filme> _f = repository.findById(id);
        return _f.orElse(null);
    }

    public List<Filme> findAll() {
        return repository.findAll();
    }

    public boolean update(Filme f) {
        if (repository.existsById(f.getId())) {
            repository.save(f);
            return true;
        } return false;
    }

    public boolean delete(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } return false;
    }
}
