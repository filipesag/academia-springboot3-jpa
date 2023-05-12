package com.academiaproject.acad.controller;

import com.academiaproject.acad.entities.Instrutor;
import com.academiaproject.acad.entities.Plano;
import com.academiaproject.acad.service.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorService service;

    @GetMapping
    public ResponseEntity<List<Instrutor>> findAll() {
        List<Instrutor> instrutores = service.findAll();
        return ResponseEntity.ok().body(instrutores);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Instrutor> findById(@PathVariable Long id) {
        Instrutor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
