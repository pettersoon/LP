/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.aluno.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Aluno> alunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
        
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void matricularAluno(Aluno aluno){
        if(this.vagas >= alunos.size()){
            alunos.add(aluno);
            
            Integer vagasAtuais = this.getVagas();
        }
       
    }
    
    public void exibirAlunosMatriculados(){
        if(!alunos.isEmpty()){
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }else{
            System.out.println(String.format("A faculdade %s não possui alunos cadastrados", this.getNome()));
        }
    }
    
    public void exibirAlunosPos(){
        if(!alunos.isEmpty()){
            for (Aluno aluno : alunos) {
                if(aluno instanceof AlunoPos){
                    System.out.println(aluno);
            }
        }
    }
    
    
}

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + "Vagas Disponiveis="+ (this.vagas - this.alunos.size()) + ", alunos=" + alunos + '}';
    }
    
    
}
