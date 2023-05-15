package com.academiaproject.acad.service;

import com.academiaproject.acad.entities.Instrutor;
import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.repository.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InstrutorService {

    @Autowired
    private InstrutorRepository repository;

    public List<Instrutor> findAll() {
        return repository.findAll();
    }

    public Instrutor findById(Long id) {
        Optional<Instrutor> obj = repository.findById(id);
        return obj.get();
    }

    public Instrutor addNewInstrutor(Instrutor instrutor) {
        return repository.save(instrutor);
    }
/*
    public List<Membro> acharMembrosPorInstrutor(Instrutor instrutor) {

    }*/

}
