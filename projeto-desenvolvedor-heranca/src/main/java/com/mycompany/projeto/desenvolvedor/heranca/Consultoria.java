/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.desenvolvedor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor>desenvolvedores;
    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome){
        Boolean alunoExiste = false;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(desenvolvedores.contains(nome)){
                alunoExiste = true;
            }
        }
        return alunoExiste;
    }
    
    public void contratar(Desenvolvedor desenvolvedor){
        if (vagas == 0 ){
            System.out.println("Sem vagas disponíveis!");
        }else{
            desenvolvedores.add(desenvolvedor);
            vagas -= 1;
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer qtdDevMobile=0;
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(desenvolvedor instanceof DesenvolvedorMobile){
                qtdDevMobile += 1;
            }
        }
        
        return qtdDevMobile;
    }
    
    public Double getTotalSalarios(){
        Double valorTotalSalarios = 0.00;
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            Double salarioDevAtual = desenvolvedor.getSalario();
            
            valorTotalSalarios += salarioDevAtual;
        }
        return valorTotalSalarios;
    }
    
    public Boolean buscarDesenvolvedorPorNome(String nome){
        Boolean devExiste= false;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(nome == desenvolvedor.getNome()){
                devExiste = true;
            }
        }
        return devExiste;
    }

    @Override
    public String toString() {
        return String.format("Consultoria %s\n Vagas= %d \n Desenvolvedores %s",nome,vagas,desenvolvedores);
    }
    
    
}
