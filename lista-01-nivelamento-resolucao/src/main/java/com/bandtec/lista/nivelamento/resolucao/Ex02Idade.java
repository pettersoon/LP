package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex02Idade {

    public static void main(String[] args) {
        
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitorTexto.nextLine();
        
        System.out.println(String.format("Olá %s, Qual o seu ano de nascimento?",
                nome));
        Integer anoDeNascimento = leitorNumeros.nextInt();
        
        System.out.println(String.format("%s em 2030 você terá %d anos!",
                nome, (2030 - anoDeNascimento)));
    }
}
