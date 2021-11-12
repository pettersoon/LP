/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.professor.heranca;

/**
 *
 * @author aluno
 */
public class Coordenador extends Professor {
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer qtdHorasCoord, Double valorHoraCoord, String curso, String nome, Integer codigo, Integer qtdHoras, Double valorHora) {
        super(nome, codigo, qtdHoras, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Double calculaSalario(){
        return ((super.valorHora * super.qtdHoras) * 4.5)+((this.valorHoraCoord * this.qtdHorasCoord) * 4.5);
    }

    @Override
    public String toString() {
        return "Coordenador{"+super.toString() + "qtdHorasCoord=" + qtdHorasCoord + ", valorHoraCoord=" + valorHoraCoord + ", curso=" + curso + "salarioCoord="+calculaSalario()+'}';
    }
    
    
}
