package com.estudando.recuperacao.mapper;

import org.springframework.stereotype.Component;

import com.estudando.recuperacao.dto.equipamento.EquipamentoRequest;
import com.estudando.recuperacao.dto.equipamento.EquipamentoResponse;
import com.estudando.recuperacao.dto.setor.SetorResume;
import com.estudando.recuperacao.model.Equipamento;

@Component
public class EquipamentoMapper {


    public Equipamento toEntity(EquipamentoRequest equipamentoRequest){
        return new Equipamento(
            equipamentoRequest.nome(),
            equipamentoRequest.patrimonio(),
            equipamentoRequest.valorAquisicao(),
            equipamentoRequest.dataAquisicao(),
            equipamentoRequest.emManutencao()
        );
    }

    public EquipamentoResponse toResponse(Equipamento equipamento){

        return new EquipamentoResponse(
            equipamento.getId(),
            equipamento.getNome(),
            equipamento.getPatrimonio(),
            equipamento.getValorAquisicao(),
            equipamento.getDataAquisicao(),
            equipamento.isEmManutencao(),
            new SetorResume(
            equipamento.getSetor().getId(),
            equipamento.getSetor().getNome(),
            equipamento.getSetor().getAndar(),
            equipamento.getSetor().isAtivo()
        )
        );
    }


}
