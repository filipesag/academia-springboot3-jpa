package com.academiaproject.acad.repository;

import com.academiaproject.acad.entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long> {
}
