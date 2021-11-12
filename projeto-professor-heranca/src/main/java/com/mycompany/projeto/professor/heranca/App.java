/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.professor.heranca;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Paulo", 123, 12, 100.0);
        Coordenador coordenador1 = new Coordenador(12, 100.0, "LP", "Diego", 456, 12, 100.0);
        
        System.out.println(professor1);
        System.out.println("------------------------------------------------------");
        System.out.println(coordenador1);
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
    
        Faculdade faculdade1 = new Faculdade("Bandtec", 5);
        
        faculdade1.contratarProfessor(professor1);
        faculdade1.contratarProfessor(coordenador1);
        
        faculdade1.exibirprofessores();
        System.out.println(faculdade1);
        
        
    }
}
