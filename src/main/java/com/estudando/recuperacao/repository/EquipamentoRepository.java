package com.estudando.recuperacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudando.recuperacao.model.Equipamento;

@Repository
public interface  EquipamentoRepository extends JpaRepository<Equipamento, Long>{
    
}
