package com.academiaproject.acad.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "modalidade")
public class Modalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @JsonIgnore
    @ManyToMany(mappedBy = "modalidades")
    private Set<Instrutor> instrutores = new HashSet<>();

    public Modalidade(){}

    public Modalidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Modalidade(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.academiaproject.acad.entities.Modalidade that = (com.academiaproject.acad.entities.Modalidade) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
