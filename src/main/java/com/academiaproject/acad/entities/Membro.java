package com.academiaproject.acad.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

import static java.util.Objects.hash;

@Entity
@Table(name = "membro")
public class Membro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cep;
    @Column(name = "data_vencimento")
    private Date dataVencimento;
    private String telefone;

    public Membro(){}

    public Membro(int id, String nome, String cpf, String rua, String bairro, String cep, java.util.Date dataVencimento, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.dataVencimento = dataVencimento;
        this.telefone = telefone;
    }

    public Membro(String nome, String cpf, String rua, String bairro, String cep, java.util.Date dataVencimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.dataVencimento = dataVencimento;
        this.telefone = telefone;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public java.util.Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(java.util.Date dataVencimento) {
        this.dataVencimento = dataVencimento;
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
        var membro = (Membro) o;
        return id == membro.id;
    }

    @Override
    public int hashCode() {
        return hash(id);
    }
}
