/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.desenvolvedor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor>desenvolvedores;
    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome){
        Boolean alunoExiste = false;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(desenvolvedores.contains(nome)){
                alunoExiste = true;
            }
        }
        return alunoExiste;
    }
    
    public void contratar(Desenvolvedor desenvolvedor){
        
    }
}
