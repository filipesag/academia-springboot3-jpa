package com.academiaproject.acad.controller;

import com.academiaproject.acad.entities.Modalidade;
import com.academiaproject.acad.service.ModalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/modalidades")
public class ModalidadeController {

    @Autowired
    private ModalidadeService service;

    @GetMapping
    public ResponseEntity<List<Modalidade>> findAll() {
        List<Modalidade> modalidades = service.findAll();
        return ResponseEntity.ok().body(modalidades);
    }

    @PostMapping
    public ResponseEntity<Modalidade> insertNewModalidade(@RequestBody Modalidade mod) {
        mod = service.insertNewModalidade(mod);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(mod.getId()).toUri();
        return ResponseEntity.created(uri).body(mod);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteModalidade(@PathVariable Long id) {
        service.deleteModalidade(id);
        return ResponseEntity.noContent().build();
    }
}
