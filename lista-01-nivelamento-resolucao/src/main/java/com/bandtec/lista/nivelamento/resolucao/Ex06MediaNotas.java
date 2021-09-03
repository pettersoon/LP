package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex06MediaNotas {
    
    public static void main(String[] args) {
        
        Scanner leitorNumeros = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        System.out.println("Olá, digite seu nome:");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Digite a primeira nota:");
        Double nota1 = leitorNumeros.nextDouble();
        
        System.out.println("Digite a primeira nota:");
        Double nota2 = leitorNumeros.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("%s sua média é : %.1f",
                nome, media));
        
    }
}
