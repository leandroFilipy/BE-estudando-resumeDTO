package com.estudando.recuperacao.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipamento {

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String patrimonio;
    private BigDecimal valorAquisicao;
    private LocalDate dataAquisicao;
    private boolean emManutencao;

    @ManyToOne
    private Setor setor;

    public Equipamento(String nome, String patrimonio, BigDecimal valorAquisicao, LocalDate dataAquisicao, boolean emManutencao) {
        this.nome = nome;
        this.patrimonio = patrimonio;
        this.valorAquisicao = valorAquisicao;
        this.dataAquisicao = dataAquisicao;
        this.emManutencao = emManutencao;
    }



}
