package com.example.apiAtoresCiro.repositories;

import com.example.apiAtoresCiro.models.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository
        extends JpaRepository<Ator, Long> {
}
