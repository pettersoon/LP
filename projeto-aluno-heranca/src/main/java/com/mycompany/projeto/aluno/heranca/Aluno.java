/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.aluno.heranca;

/**
 *
 * @author aluno
 */
public class Aluno {
    private Integer ra;
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }
    
    
    public Double calcularMedia(){
        return (this.notaContinuada * 0.4) + (this.notaSemestral * 0.6);
    }

    @Override
    public String toString() {
        Double mediaFinal = ((notaContinuada * 0.4) + (notaSemestral * 0.6));
        
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + "Média Final="+mediaFinal +'}';
    }
    
    
}
