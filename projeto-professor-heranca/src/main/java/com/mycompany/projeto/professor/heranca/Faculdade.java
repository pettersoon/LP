/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.professor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Professor
 */
public class Faculdade {
  private String nome;
  private Integer vagas;
  private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
        
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

    public List<Professor> getprofessores() {
        return professores;
    }

    public void setprofessores(List<Professor> professores) {
        this.professores = professores;
    }
    
    public void contratarProfessor(Professor p){
        if(this.vagas >= professores.size()){
            professores.add(p);
        }
       
    }
    
    public void exibirprofessores(){
        if(!professores.isEmpty()){
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }else{
            System.out.println(String.format("A faculdade %s não possui professores cadastrados", this.getNome()));
        }
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + "Disponiveis" + (this.vagas - this.professores.size()) + ", professores=" + professores + '}';
    }
    
    
    

}
