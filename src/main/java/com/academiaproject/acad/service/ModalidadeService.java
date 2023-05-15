package com.academiaproject.acad.service;

import com.academiaproject.acad.entities.Modalidade;
import com.academiaproject.acad.repository.ModalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalidadeService {

    @Autowired
    private ModalidadeRepository repository;

    public List<Modalidade> findAll() {
        return repository.findAll();
    }

    public Modalidade insertNewModalidade(Modalidade mod) {
        return repository.save(mod);
    }

    public void deleteModalidade(Long id) {
        repository.deleteById(id);
    }
}
