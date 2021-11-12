/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.aluno.heranca;

/**
 *
 * @author aluno
 */
public class AlunoPos extends Aluno{
    
    private Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    public Double calcularMedia(){
        
        return (super.getNotaContinuada()+super.getNotaSemestral()+this.notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunoPos{"+ super.toString() + " notaMonografia=" + notaMonografia +
                " Media AlunoPos=" + calcularMedia() + '}';
    }
    
    
    
    
    
    
    
    
    
}
