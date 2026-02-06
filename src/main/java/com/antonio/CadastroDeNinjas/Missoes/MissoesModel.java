package com.antonio.CadastroDeNinjas.Missoes;

import com.antonio.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "/tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    private String descricao;
    private String rankDaMissao;
    private String localDaMissao;

    @OneToMany(mappedBy = "missoes")//Uma missão por ninja
    @JoinColumn(name = "missoes_id")//Foreign Key
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade, String descricao, String rankDaMissao, String localDaMissao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.rankDaMissao = rankDaMissao;
        this.localDaMissao = localDaMissao;
    }

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRankDaMissao() {
        return rankDaMissao;
    }

    public String getLocalDaMissao() {
        return localDaMissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRankDaMissao(String rankDaMissao) {
        this.rankDaMissao = rankDaMissao;
    }

    public void setLocalDaMissao(String localDaMissao) {
        this.localDaMissao = localDaMissao;
    }
}
