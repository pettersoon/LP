package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex05CalculadoraDeSalario {
    
    public static void main(String[] args) {
        
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Digite o salário:");
        Double salario = leitorNumeros.nextDouble();
        
        System.out.println("Digite o valor do imposto em '%' (número inteiro):");
        Double porcentagem = leitorNumeros.nextDouble() / 100;
        
        Double salarioLiquido = salario - (salario * porcentagem);
        
        System.out.println(String.format("\nSalário líquido: R$%.2f", 
                salarioLiquido));
    }
}
