package com.example.apiAtoresCiro.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Filme extends AbstractEntity {

    private String titulo;
    private int ano;

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
