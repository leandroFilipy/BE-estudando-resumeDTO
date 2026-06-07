package com.estudando.recuperacao.dto.setor;

import java.util.List;

import com.estudando.recuperacao.dto.equipamento.EquipamentoResponse;

public record SetorResponse (
    long id,
    String nome,
    int andar,
    boolean ativo,
    List<EquipamentoResponse> equipamentos
){
    
}
