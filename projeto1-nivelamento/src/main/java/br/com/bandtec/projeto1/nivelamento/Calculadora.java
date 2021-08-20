
package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Double numero = leitor.nextDouble();
        
        System.out.println("Digite um segundo número");
        Double segundoNumero = leitor.nextDouble();
        
        System.out.println(String.format("Resultado da soma: %.1f\nResultado da"
                + "subtração: %.1f\nResultado da multiplicação: %.1f\nResultado"
                + " da divisão: %.1f", (numero+segundoNumero), 
                (numero-segundoNumero), (numero*segundoNumero), 
                (numero/segundoNumero)));
    }
    
}
