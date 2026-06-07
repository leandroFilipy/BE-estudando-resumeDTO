package com.estudando.recuperacao.dto.equipamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.estudando.recuperacao.dto.setor.SetorResume;

public record  EquipamentoResponse (
    long id,
    String nome,
     String patrimonio,
     BigDecimal valorAquisicao,
     LocalDate dataAquisicao,
     boolean emManutencao,
     SetorResume setor
){
}
