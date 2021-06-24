package com.example.apiAtoresCiro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Filme extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private int ano;

    @ManyToMany(mappedBy = "filmesDoAtor")
    private List<Ator> atoresParticipantes;

    @JsonProperty
    public void setAtoresParticipantes(List<Ator> listaAtores) {
        this.atoresParticipantes = listaAtores;
    }

    public List<Ator> getAtoresParticipantes() {
        return atoresParticipantes;
    }

    public Filme() {
        super();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
