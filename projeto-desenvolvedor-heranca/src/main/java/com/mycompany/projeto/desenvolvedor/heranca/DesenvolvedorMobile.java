/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.desenvolvedor.heranca;

/**
 *
 * @author aluno
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    
    
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    public Double getSalario(){
        return (super.valorHoraTrabalhada * super.qtdHorasTrabalhadas)+(this.qtdHorasTrabalhadasMobile * this.valorHoraTrabalhadaMobile);
    }

    @Override
    public String toString() {
        String infoDesenvolvedor = String.format("Nome: %s\n "
                + "Horas Trabalhadas DEV: %d\n "
                + "Valor Hora DEV: %.2f\n "
                + "Horas Trabalhadas DEVmobile: %d\n"
                + "Valor Hora DEVmobile: %.2f\n"
                + " Salario:%.2f",
                super.getNome(),
                super.qtdHorasTrabalhadas,
                super.valorHoraTrabalhada,
                this.qtdHorasTrabalhadasMobile,
                this.valorHoraTrabalhadaMobile,
                this.getSalario());
        return infoDesenvolvedor;
    }
    
    
    
}
