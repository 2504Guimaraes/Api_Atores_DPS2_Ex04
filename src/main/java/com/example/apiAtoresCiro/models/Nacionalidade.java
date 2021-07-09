package com.example.apiAtoresCiro.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Nacionalidade extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private String pais;

    public Nacionalidade() {
        super();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
