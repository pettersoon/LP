/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.encapsulamento;

/**
 *
 * @author aluno
 */
public class Aluno {
   
    
    private String ra;
    private String nome; 
    private Double nota1;
    private Double nota2;
    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota1 = 0.0;
        
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }
    
 

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }
    
    public Double getMedia(){
        return (nota1+nota2)/2;
    }
    
    
    

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        String texto = "NOme: %s, Nota 01: %.1f, Nota 02: %.1f, media: %.1f";
        
    }
    
    
     
}
