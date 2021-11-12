/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.aluno.heranca;

/**
 *
 * @author aluno
 */
public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(123, "Petterson", 5.9, 6.5 );
        
        System.out.println(String.format("O aluno %s tem média %.2f", 
                aluno1.getNome(),aluno1.calcularMedia()));
    
        System.out.println(aluno1);
        
        System.out.println("------------------------------------------------");
        
        Aluno aluno2 = new Aluno(456, "João", 7.5, 7.0);
        
        System.out.println(String.format("O aluno %s tem média %.2f", 
                aluno2.getNome(),aluno2.calcularMedia()));
    
        System.out.println(aluno2);
        
        System.out.println("------------------------------------------------");
        
        AlunoPos aluno3 = new AlunoPos(9.4, 789, "Jorge", 6.5, 8.0);
       
        System.out.println(String.format("O AlunoPos %s tem média %.2f", 
                aluno3.getNome(),aluno3.calcularMedia()));
    
        System.out.println(aluno3);
        
        System.out.println("------------------------------------------------");
        
        Faculdade bandtec = new Faculdade("Bandtec", 5);
        
        bandtec.matricularAluno(aluno1);
        bandtec.matricularAluno(aluno2);
        bandtec.matricularAluno(aluno3);
       
        System.out.println("------------------------------------------------");
        
        bandtec.exibirAlunosMatriculados();
        
        System.out.println(bandtec);
    }
    
}
