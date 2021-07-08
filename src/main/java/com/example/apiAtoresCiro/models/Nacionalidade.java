package com.example.apiAtoresCiro.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Nacionalidade extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private String pais;

    @OneToMany(mappedBy = "nacionalidade")
    private List<Ator> atoresNacionalidade;

    public Nacionalidade() {
        super();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Ator> getAtoresNacionalidade() {
        return atoresNacionalidade;
    }

    public void setAtoresNacionalidade(List<Ator> atoresNacionalidade) {
        this.atoresNacionalidade = atoresNacionalidade;
    }
}
