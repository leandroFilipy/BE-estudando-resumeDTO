package com.estudando.recuperacao.mapper;

import org.springframework.stereotype.Component;

import com.estudando.recuperacao.dto.setor.SetorRequest;
import com.estudando.recuperacao.dto.setor.SetorResponse;
import com.estudando.recuperacao.model.Setor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SetorMapper {
    
    private final EquipamentoMapper equipamentoMapper;


    public Setor toEntity(SetorRequest setorRequest){
        return new Setor(
            setorRequest.nome(),
            setorRequest.andar(),
            setorRequest.ativo()
        );
    }

    public SetorResponse toResponse(Setor setor){
        return new SetorResponse(
            setor.getId(),
            setor.getNome(),
            setor.getAndar(),
            setor.isAtivo(),
            setor.getEquipamentos()!=null? setor.getEquipamentos().stream().map(equipamentoMapper::toResponse).toList(): null
        );
    }
}
