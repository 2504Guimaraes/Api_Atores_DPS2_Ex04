package com.example.apiAtoresCiro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Ator extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private String nome;
    private Date nascimento;

    @ManyToMany
    @JoinTable(name = "tb_filme_ator",
    joinColumns = @JoinColumn(name = "cd_ator"),
    inverseJoinColumns = @JoinColumn(name = "cd_filme"))
    private List<Filme> filmesDoAtor;

    @ManyToOne
    private Nacionalidade nacionalidade;

    @JsonProperty
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Nacionalidade getNacionalidade() {
        return this.nacionalidade;
    }

    @JsonProperty
    public void setFilmes(List<Filme> filmes) {
        this.filmesDoAtor = filmes;
    }

    public List<Filme> getFilmes() {
        return filmesDoAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
