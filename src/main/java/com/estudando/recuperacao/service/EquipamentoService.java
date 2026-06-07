package com.estudando.recuperacao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.estudando.recuperacao.dto.equipamento.EquipamentoRequest;
import com.estudando.recuperacao.dto.equipamento.EquipamentoResponse;
import com.estudando.recuperacao.mapper.EquipamentoMapper;
import com.estudando.recuperacao.model.Equipamento;
import com.estudando.recuperacao.model.Setor;
import com.estudando.recuperacao.repository.EquipamentoRepository;
import com.estudando.recuperacao.repository.SetorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipamentoService {

    private final EquipamentoMapper mapper;
    private final EquipamentoRepository repository;
    private final SetorRepository setorRepository;


    public EquipamentoResponse create(EquipamentoRequest equipamentoRequest){
        Setor setor = setorRepository.findById(equipamentoRequest.idSetor()).orElseThrow(() -> new RuntimeException());
        Equipamento equipamento = mapper.toEntity(equipamentoRequest);
        equipamento.setSetor(setor);
        Equipamento equipamentoSalvo = repository.save(equipamento);
        EquipamentoResponse equipamentoResponse = mapper.toResponse(equipamentoSalvo);
        return equipamentoResponse;
    }

    public List<EquipamentoResponse> listAll(){
        List<Equipamento> equipamentos = repository.findAll();
        List<EquipamentoResponse> dto = new ArrayList<>();

        for(Equipamento e: equipamentos){
            dto.add(mapper.toResponse(e));
        }
        return dto;
    }

    public EquipamentoResponse findById(long id){
        Equipamento equipamento = repository.findById(id).orElseThrow(() -> new RuntimeException());
        EquipamentoResponse equipamentoResponse = mapper.toResponse(equipamento);
        return equipamentoResponse;
    }

    public EquipamentoResponse update(long id, EquipamentoRequest equipamentoRequest){
        Setor setor = setorRepository.findById(id).orElseThrow(()-> new RuntimeException());
        Equipamento equipamento = repository.findById(id).orElseThrow(()-> new RuntimeException());
        equipamento.setNome(equipamentoRequest.nome());
        equipamento.setPatrimonio(equipamentoRequest.patrimonio());
        equipamento.setValorAquisicao(equipamentoRequest.valorAquisicao());
        equipamento.setDataAquisicao(equipamentoRequest.dataAquisicao());
        equipamento.setEmManutencao(equipamentoRequest.emManutencao());
        equipamento.setSetor(setor);
        Equipamento equipamentoSalvo = repository.save(equipamento);
        EquipamentoResponse equipamentoResponse = mapper.toResponse(equipamentoSalvo);
        return equipamentoResponse;
    }

    public void delete(long id){
        repository.deleteById(id);
    }


}
