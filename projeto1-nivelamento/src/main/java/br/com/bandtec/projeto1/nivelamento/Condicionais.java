
package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args) {
        
        /*
            Operadores Lógicos
            ==
            !=
            >
            <
            >=
            <=
            &&
            ||
        */
        
        Integer dia = 1;
        
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a faculdade: ");
        String nomeDigitado = leitor.nextLine();
        
        if (nomeDigitado.equalsIgnoreCase("Bandtec")) {
            System.out.println("Melhor Faculdade");
        } else {
            System.out.println("Deu ruim");
        }

//        Boolean ligado = true;
//        if (false) {
//            System.out.println("É verdadeiro");
//        } else {
//            System.out.println("É falso");
//        }
        
//        System.out.println("Digite sua idade: ");
//        Integer idade = leitor.nextInt();
//        
//        if (idade >= 18) {
//            System.out.println("Pode tirar CNH");
//        } else {
//            System.out.println("Não pode");
//        }
    
    }
}