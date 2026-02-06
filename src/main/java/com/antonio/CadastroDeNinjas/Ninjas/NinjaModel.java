package com.antonio.CadastroDeNinjas.Ninjas;

import com.antonio.CadastroDeNinjas.Missoes.Missoes;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String email;
    private String cla;
    private String rank;
    private String tecnicas;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")//foreign key
    private Missoes missoes;

    public NinjaModel(String email, String cla, String rank, String tecnicas) {
        this.email = email;
        this.cla = cla;
        this.rank = rank;
        this.tecnicas = tecnicas;
    }

    public NinjaModel(int idade, Missoes missoes, String nome) {
        this.idade = idade;
        this.missoes = missoes;
        this.nome = nome;
    }

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public NinjaModel() {
    }




}
