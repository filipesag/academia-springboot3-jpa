package com.academiaproject.acad.service;

import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembroService {

    @Autowired
    private MembroRepository repository;

    public List<Membro> findAll() {
        return repository.findAll();
    }

    public Membro findById(Long id) {
        Optional<Membro> obj = repository.findById(id);
        return obj.get();
    }

}
