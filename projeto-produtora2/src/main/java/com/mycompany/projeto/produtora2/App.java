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
public class App {
    public static void main(String[] args) {
        Produtora prod1 = new Produtora("BAlacubaco", 5);
        Ator a1 = new Ator("Julio", 10, 10.00);
        Ator a2 = new Ator("Alex", 10, 10.00);
        Protagonista a3 = new Protagonista(10, 10.00, "Armando", 10, 10.00);
        
        System.out.println(prod1);
        
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        System.out.println("--------------------------------------------\n");
        
        prod1.contratar(a1);
        prod1.contratar(a3);
        System.out.println(prod1.buscarAtorPorNome("Alex"));
        
        System.out.println("--------------------------------------------\n");
        
        System.out.println(prod1.existePorNome("Julio"));
        System.out.println(prod1.getQuantidadeAtores());
        System.out.println(prod1.getQuantidadeProtagonista());
        System.out.println(prod1.getTotalSalarios());
        System.out.println(prod1.getVagas());
    }
}
