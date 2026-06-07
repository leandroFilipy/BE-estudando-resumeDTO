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

import com.estudando.recuperacao.dto.setor.SetorRequest;
import com.estudando.recuperacao.dto.setor.SetorResponse;
import com.estudando.recuperacao.service.SetorService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/setores")
@RestController
public class SetorController {
    
    private final SetorService service;


    @PostMapping
    public ResponseEntity<SetorResponse> create(@RequestBody SetorRequest setorRequest){
        return ResponseEntity.status(201).body(service.create(setorRequest));
    }

    @GetMapping
    public ResponseEntity<List<SetorResponse>> listAll(){
        return ResponseEntity.status(200).body(service.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SetorResponse> findById(@PathVariable long id){
        return ResponseEntity.status(200).body(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SetorResponse> update(@PathVariable long id, @RequestBody SetorRequest setorRequest){
        return ResponseEntity.status(200).body(service.update(id, setorRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.status(204).build();
    }


}
