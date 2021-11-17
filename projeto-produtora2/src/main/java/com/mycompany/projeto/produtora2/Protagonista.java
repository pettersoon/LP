/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.produtora2;

/**
 *
 * @author aluno
 */
public class Protagonista extends Ator {
    
    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(Integer qtdHorasTrabalhadasProtagonista, Double valorHoraTrabalhadaProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    public Integer getQtdHorasTrabalhadasProtagonista() {
        return qtdHorasTrabalhadasProtagonista;
    }

    public void setQtdHorasTrabalhadasProtagonista(Integer qtdHorasTrabalhadasProtagonista) {
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }
    
    public Double getSalario(){
        return super.getSalario() +(qtdHorasTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista);
    }

    @Override
    public String toString() {
        return String.format("Nome Ator= %s\n"
                + "Quantidade de Horas Trabalhadas como Ator= %d"
                + "Valor da Hora Trabalhada como Ator= %.2f"
                + "Quantidade de horas trabalhadas Protagonista= %d\n"
                + "Valor da hora trabalhada Protagonista= %.2f\n"
                + "Salario Protagonista= %.2f",
                super.getNome(),
                super.getQtdHorasTrabalhadas(),
                super.getValorHoraTrabalhada(),
                qtdHorasTrabalhadasProtagonista,
                valorHoraTrabalhadaProtagonista,
                getSalario()
        );
    }
}
