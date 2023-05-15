package com.academiaproject.acad.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    @Column(name = "data_vencimento")
    private Date dataVencimento;
    private String telefone;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_instrutor")
    private Instrutor instrutor;

    public Membro(){}

    public Membro(int id, String nome, String cpf, String rua, String bairro, String cep, String telefone, Date dataVencimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.dataVencimento = dataVencimento;
    }

    public Membro(String nome, String cpf, String rua, String bairro, String cep, String telefone, Date dataVencimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.dataVencimento = dataVencimento;
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
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
