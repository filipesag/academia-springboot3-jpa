package com.academiaproject.acad.entities.pk;


import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.entities.Plano;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.hash;

@Embeddable
public class MembroPlanoPk implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_membro")
    private Membro membro;

    @ManyToOne
    @JoinColumn(name = "id_plano")
    private Plano plano;

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var that = (MembroPlanoPk) o;
        if (!Objects.equals(membro, that.membro)) return false;
        if (Objects.equals(plano, that.plano)) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return hash(membro, plano);
    }
}
