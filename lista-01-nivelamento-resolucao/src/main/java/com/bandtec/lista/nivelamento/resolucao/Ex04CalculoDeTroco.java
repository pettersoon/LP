package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex04CalculoDeTroco {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário de um produto:");
        Double valorProduto = leitorNumero.nextDouble();
        
        System.out.println("Digite a quantidade vendida:");
        Integer quantidadeVendida = leitorNumero.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente:");
        Double valorPago = leitorNumero.nextDouble();
        
        System.out.println(String.format("Troco para o cliente: R$%.2f",
                (valorPago - (valorProduto*quantidadeVendida))));
    }
}
