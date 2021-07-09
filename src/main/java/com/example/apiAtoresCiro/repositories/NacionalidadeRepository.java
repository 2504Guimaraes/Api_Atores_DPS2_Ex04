package com.example.apiAtoresCiro.repositories;

import com.example.apiAtoresCiro.models.Nacionalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadeRepository
    extends JpaRepository<Nacionalidade, Long> {
}
