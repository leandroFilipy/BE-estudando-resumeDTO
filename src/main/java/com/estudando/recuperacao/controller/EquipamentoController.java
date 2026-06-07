package com.estudando.recuperacao.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.recuperacao.dto.equipamento.EquipamentoRequest;
import com.estudando.recuperacao.dto.equipamento.EquipamentoResponse;
import com.estudando.recuperacao.service.EquipamentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/equipamentos")
@RequiredArgsConstructor
public class EquipamentoController {

    private final EquipamentoService service;

    
    @PostMapping
    public ResponseEntity<EquipamentoResponse> create(@RequestBody EquipamentoRequest equipamentoRequest){
        return ResponseEntity.status(201).body(service.create(equipamentoRequest));
    }

    
    @GetMapping
    public ResponseEntity<List<EquipamentoResponse>> listAll(){
        return ResponseEntity.status(200).body(service.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipamentoResponse> findById(@PathVariable long id){
        return ResponseEntity.status(200).body(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipamentoResponse> update(@PathVariable long id, @RequestBody EquipamentoRequest equipamentoRequest){
        return ResponseEntity.status(200).body(service.update(id, equipamentoRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.status(204).build();
    }

}
