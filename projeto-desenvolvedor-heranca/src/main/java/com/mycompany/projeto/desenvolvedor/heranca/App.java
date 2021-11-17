/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.desenvolvedor.heranca;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        
        Consultoria consu1 = new Consultoria("bandtec", 5);
        Desenvolvedor dev1 = new Desenvolvedor("ALEX", 10, 10.00);
        Desenvolvedor dev2 = new Desenvolvedor("pedro", 10, 10.00);
        DesenvolvedorMobile dev3 = new DesenvolvedorMobile("José", 10, 10.00, 10, 10.00);
        
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        System.out.println("---------------------------\n");
        
        System.out.println(consu1);
        consu1.contratar(dev1);
        consu1.contratar(dev3);
        System.out.println(consu1.buscarDesenvolvedorPorNome("pedro")
        );
        
        System.out.println("---------------------------\n");
        System.out.println(consu1.getQuantidadeDesenvolvedores());
        System.out.println(consu1.getQuantidadeDesenvolvedoresMobile());
        System.out.println(consu1.getTotalSalarios());
        System.out.println("---------------------------\n");
        System.out.println(consu1);
        
        
    }
}
