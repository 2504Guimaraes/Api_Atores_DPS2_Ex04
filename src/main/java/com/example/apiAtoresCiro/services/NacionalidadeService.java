package com.example.apiAtoresCiro.services;

import com.example.apiAtoresCiro.models.Nacionalidade;
import com.example.apiAtoresCiro.repositories.NacionalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NacionalidadeService {
    @Autowired
    private NacionalidadeRepository repository;

    public Nacionalidade create(Nacionalidade n) {
        repository.save(n);
        return n;
    }

    public Nacionalidade findById(Long id) {
        Optional<Nacionalidade> _f = repository.findById(id);
        return _f.orElse(null);
    }

    public List<Nacionalidade> findAll() {
        return repository.findAll();
    }

    public boolean update(Nacionalidade n) {
        if (repository.existsById(n.getId())) {
            repository.save(n);
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
