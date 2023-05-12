package com.academiaproject.acad.controller;

import com.academiaproject.acad.entities.Plano;
import com.academiaproject.acad.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/planos")
public class PlanoController {

    @Autowired
    private PlanoService service;

    @GetMapping
    public ResponseEntity<List<Plano>> findAll() {
        List<Plano> planos = service.findAll();
        return ResponseEntity.ok().body(planos);
    }

}
