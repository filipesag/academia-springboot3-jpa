package com.academiaproject.acad.controller;

import com.academiaproject.acad.entities.Membro;
import com.academiaproject.acad.service.InstrutorService;
import com.academiaproject.acad.service.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/membros")
public class MembroController {

    @Autowired
    private MembroService service;

    @GetMapping
    public ResponseEntity<List<Membro>> findAll() {
        List<Membro> membros = service.findAll();
        return ResponseEntity.ok().body(membros);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Membro> findById(@PathVariable Long id) {
        Membro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
