package com.academiaproject.acad.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.hash;

@Entity
@Table(name = "plano")
public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Double preco;

    @Column(name = "modalidade", columnDefinition = "set('Musculação','Pilates','Treino_Funcioanl','Jiu_Jitsu','Boxe')")
    private String modalidade;

    @OneToMany(mappedBy = "id.plano")
    private Set<MembroPlano> membros = new HashSet<>();

    public Plano(){}

    public Plano(int id, String nome, Double preco, String modalidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.modalidade = modalidade;
    }

    public Plano(String nome, Double preco, String modalidade) {
        this.nome = nome;
        this.preco = preco;
        this.modalidade = modalidade;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Set<Membro> getMembros() {
        Set<Membro> set = new HashSet<>();
        for(MembroPlano x : membros) {
            set.add(x.getMembro());
        }
        return set;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.academiaproject.acad.entities.Plano plano = (com.academiaproject.acad.entities.Plano) o;
        return id == plano.id;
    }

    @Override
    public int hashCode() {
        return hash(id);
    }
}
