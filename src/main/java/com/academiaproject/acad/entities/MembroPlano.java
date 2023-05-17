package com.academiaproject.acad.entities;

import com.academiaproject.acad.entities.pk.MembroPlanoPk;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "membro_plano")
public class MembroPlano implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private MembroPlanoPk id = new MembroPlanoPk();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    @Column(name = "data_vencimento")
    private Date dataVencimento;

    public MembroPlano(){
    }

    public MembroPlano(Membro membro, Plano plano, Date dataVencimento) {
        id.setMembro(membro);
        id.setPlano(plano);
        this.dataVencimento = dataVencimento;
    }

    @JsonIgnore
    public Membro getMembro() {
        return id.getMembro();
    }


    public void SetMembro(Membro membro) {
        id.setMembro(membro);
    }

    public void SetPlano(Plano plano) {
        id.setPlano(plano);
    }

    @JsonIgnore
    public Plano getPlano() {
        return id.getPlano();
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
