package com.example.apiAtoresCiro.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
