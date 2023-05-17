package com.academiaproject.acad.service;

import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.entities.Plano;
import com.academiaproject.acad.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public List<Plano> findAll() {
        return repository.findAll();
    }

/*    public Plano acharPorMembro(Membro membro) {
        return membro.getPlano();
    }*/
}
