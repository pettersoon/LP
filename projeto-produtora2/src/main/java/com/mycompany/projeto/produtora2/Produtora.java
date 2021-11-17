/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.produtora2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Produtora {
    private String nome;
    private Integer vagas;
    private List<Ator>atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
    public Boolean existePorNome (String nome){
        Boolean atorExiste = false;
        for (Ator ator : atores) {
            if(ator.getNome() == nome){
                atorExiste = true;
            }
        }
        return atorExiste;
    }
    
    public void contratar(Ator ator){
        if (vagas == 0 ){
            System.out.println("Sem vagas disponíveis!");
        }else{
            atores.add(ator);
            vagas -= 1;
        }
    }
    
    public Integer getQuantidadeAtores(){
        return atores.size();
    }
    
    public Integer getQuantidadeProtagonista(){
        Integer qtdProtagonista=0;
        
        for (Ator ator : atores) {
            if(ator instanceof Protagonista){
                qtdProtagonista += 1;
            }
        }
        
        return qtdProtagonista;
    }
    
    public Double getTotalSalarios(){
        Double valorTotalSalarios = 0.00;
        
        for (Ator ator : atores) {
            Double salarioDoAtorAtual = ator.getSalario();
            
            valorTotalSalarios += salarioDoAtorAtual;
        }
        return valorTotalSalarios;
    }
    
    public String buscarAtorPorNome(String nome){
        String atorExiste = "Null";
        for (Ator ator : atores) {
            if(nome == ator.getNome()){
                atorExiste = "Existe";
            }
        }
        return atorExiste;
    }

    @Override
    public String toString() {
        return String.format("Produtora %s\n"
                + "Quantidade de vagas: %d\n"
                + "Atores: %s",
                this.nome,
                this.vagas,
                this.atores);
    }
}
