package com.academiaproject.acad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "instrutor")
public class Instrutor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String telefone;

    public Instrutor(){}

    public Instrutor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Instrutor(String nome) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.academiaproject.acad.entities.Instrutor instrutor = (com.academiaproject.acad.entities.Instrutor) o;
        return id == instrutor.id;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
