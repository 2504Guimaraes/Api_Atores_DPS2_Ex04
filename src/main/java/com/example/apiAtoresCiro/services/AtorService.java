package com.example.apiAtoresCiro.services;

import com.example.apiAtoresCiro.models.Ator;
import com.example.apiAtoresCiro.repositories.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtorService {
    @Autowired
    private AtorRepository repository;

    public Ator create(Ator ator) {
        repository.save(ator);
        return ator;
    }

    public Ator findById(Long id) {
        Optional<Ator> _f = repository.findById(id);
        return _f.orElse(null);
    }

    public List<Ator> findAll() {
        return repository.findAll();
    }

    public boolean update(Ator ator) {
        if (repository.existsById(ator.getId())) {
            repository.save(ator);
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
