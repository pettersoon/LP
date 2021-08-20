package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        
        System.out.println("Exemplo 01: for\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("-".repeat(30));
        System.out.println("\nExemplo 02: for\n");
        
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("-".repeat(30));
        System.out.println("\nExemplo 01: while\n");
        
        Integer contador = 0;
        while (contador < 10) {
            System.out.println(contador + 1);
            contador++;
        }
        
        System.out.println("-".repeat(30));
        System.out.println("\nExemplo 02: while\n");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número legal: ");
        Integer numero = leitor.nextInt();
        
        while (numero != 13) {
            System.out.println("Resposta errada...\n Digite novamente");
            numero = leitor.nextInt();
        }
        System.out.println("Parabéns!!!\nA resposta para vida é:\n" + numero);

        
        Integer numero2;
        
        do {
            System.out.println("Digite novamente...");
            numero2 = leitor.nextInt();
        } while (numero2 != 13);
    }
}
