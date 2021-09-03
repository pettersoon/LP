
package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex01CalculadoraSimples {
    
    public static void main(String[] args) {
    
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        Double primeiroNumeroDigitado = leitorNumeros.nextDouble();
        
        System.out.println("Digite o primeiro número:");
        Double segundoNumeroDigitado = leitorNumeros.nextDouble();
        
        String textoPadrao = "%.2f %s %.2f = %.2f";
        
        System.out.println(String.format(textoPadrao, 
                primeiroNumeroDigitado,
                "-",
                segundoNumeroDigitado,
                (primeiroNumeroDigitado-segundoNumeroDigitado)
        ));
        
        System.out.println(String.format(textoPadrao, 
                primeiroNumeroDigitado,
                "+",
                segundoNumeroDigitado,
                (primeiroNumeroDigitado + segundoNumeroDigitado)
        ));
        
        System.out.println(String.format(textoPadrao, 
                primeiroNumeroDigitado,
                "X",
                segundoNumeroDigitado,
                (primeiroNumeroDigitado * segundoNumeroDigitado)
        ));
        
        if (segundoNumeroDigitado != 0) {           
            System.out.println(String.format(textoPadrao, 
                    primeiroNumeroDigitado,
                    "/",
                    segundoNumeroDigitado,
                    (primeiroNumeroDigitado / segundoNumeroDigitado)
            ));
        }else{
            System.out.println("Não é permitido a divisão por zero.");
        }
    }
}
