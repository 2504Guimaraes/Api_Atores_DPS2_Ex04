package com.example.apiAtoresCiro.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Ator extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd")
    private Date nascimento;

    @ManyToMany
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

    @JsonIgnore
    public void setFilmes(List<Filme> filmesDoAtor) {
        this.filmesDoAtor = filmesDoAtor;
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
