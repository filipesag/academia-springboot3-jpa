package com.academiaproject.acad.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "instrutor")
public class Instrutor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String telefone;

    @OneToMany(mappedBy = "instrutor")
    private Set<Membro> alunos = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "instrutor_modalidade",
    joinColumns = @JoinColumn(name = "id_instrutor"),
    inverseJoinColumns = @JoinColumn(name = "id_modalidade"))
    private Set<Modalidade> modalidades = new HashSet<>();

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

    public Set<Membro> getAlunos() {
        return alunos;
    }

    public Set<Modalidade> getModalidades() {
        return modalidades;
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
