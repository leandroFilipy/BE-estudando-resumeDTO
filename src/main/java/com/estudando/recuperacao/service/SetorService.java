package com.estudando.recuperacao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.estudando.recuperacao.dto.setor.SetorRequest;
import com.estudando.recuperacao.dto.setor.SetorResponse;
import com.estudando.recuperacao.mapper.SetorMapper;
import com.estudando.recuperacao.model.Setor;
import com.estudando.recuperacao.repository.SetorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SetorService {
    
    private final SetorMapper mapper;
    private final SetorRepository repository;


    public SetorResponse create(SetorRequest setorRequest){
        Setor setor = mapper.toEntity(setorRequest);
        Setor setorSalvo = repository.save(setor);
        SetorResponse setorResponse = mapper.toResponse(setorSalvo);

        return setorResponse;
    }

    public List<SetorResponse> listAll(){
        List<Setor> setores = repository.findAll();
        List<SetorResponse> dto = new ArrayList<>();

        for(Setor s: setores){
            dto.add(mapper.toResponse(s));
        }
        return dto;
    }

    public SetorResponse findById(long id){
        Setor setor = repository.findById(id).orElseThrow(()-> new RuntimeException());
        SetorResponse setorResponse = mapper.toResponse(setor);
        return setorResponse;
    }

    public SetorResponse update(long id, SetorRequest setorRequest){
        Setor setor = repository.findById(id).orElseThrow(() ->new RuntimeException());
        setor.setNome(setorRequest.nome());
        setor.setAndar(setorRequest.andar());
        setor.setAtivo(setorRequest.ativo());
        Setor setorSalvo = repository.save(setor);
        SetorResponse setorResponse = mapper.toResponse(setorSalvo);
        return setorResponse;
    }

    public void delete(long id){
        repository.deleteById(id);
    }

}
