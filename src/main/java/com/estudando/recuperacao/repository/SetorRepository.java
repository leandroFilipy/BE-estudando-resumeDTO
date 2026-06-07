package com.estudando.recuperacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudando.recuperacao.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long>{
    
}
