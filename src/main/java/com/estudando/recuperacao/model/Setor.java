package com.estudando.recuperacao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Setor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int andar;
    private boolean ativo;

    @OneToMany(mappedBy="setor")
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Setor(String nome, int andar, boolean ativo) {
        this.nome = nome;
        this.andar = andar;
        this.ativo = ativo;
    }


    
    
}
