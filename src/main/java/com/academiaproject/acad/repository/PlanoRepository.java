package com.academiaproject.acad.repository;

import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.entities.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
/*
    Plano acharPorMembro(Membro membro);*/
}
