package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex08BolsaFilhos {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Filhos de 0 a 3 anos:");
        Integer criancas = leitorNumero.nextInt();

        System.out.println("Filhos de 4 a 16 anos:");
        Integer preAdolescentes = leitorNumero.nextInt();

        System.out.println("Filhos de 17 a 18 anos:");
        Integer adolescentes = leitorNumero.nextInt();

        Double bolsa = (criancas * 25.12) + (preAdolescentes * 15.88) + (adolescentes * 12.44);
        Integer totalFilhos = (criancas + preAdolescentes + adolescentes);

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
                totalFilhos, bolsa));
    }
}
