package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex03Elevador {
     
    public static void main(String[] args) {
        
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Digite o peso limite do elevador:");
        Double pesoMaximoElevador = leitorNumeros.nextDouble();
        
        System.out.println("Digite o número limite de pessoas em um elevador:");
        Integer numeroDePessoasTotal = leitorNumeros.nextInt();
        
        Double pesoTotal = 0.0;
        
        System.out.println("Digite o peso da primeira pessoa:");
        pesoTotal += leitorNumeros.nextDouble();
        
        System.out.println("Digite o peso da segunda pessoa:");
        pesoTotal += leitorNumeros.nextDouble();
        
        System.out.println("Digite o peso da terceira pessoa:");
        pesoTotal += leitorNumeros.nextDouble();
        
        System.out.println(String.format("\nEntraram 3 pessoas no elevador, no qual cabem %d",
                numeroDePessoasTotal));
        
        System.out.println(String.format("O peso total do elevador é %.2fkg sendo que ele suporta %.2fkg",
                pesoTotal, pesoMaximoElevador));
    }
}
