package com.example.apiAtoresCiro.repositories;

import com.example.apiAtoresCiro.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository
    extends JpaRepository<Filme, Long> {
}
