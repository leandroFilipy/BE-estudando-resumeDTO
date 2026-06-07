package com.estudando.recuperacao.dto.equipamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EquipamentoRequest (
     String nome,
     String patrimonio,
     BigDecimal valorAquisicao,
     LocalDate dataAquisicao,
     boolean emManutencao,
     Long idSetor
){
    
}
