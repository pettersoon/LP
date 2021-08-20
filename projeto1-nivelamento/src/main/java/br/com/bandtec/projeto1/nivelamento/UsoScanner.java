
package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class UsoScanner {
    
    
    public static void main(String[] args) {
        
        // Representa um "objeto" ou uma "instância" do tipo Scanner
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitorTexto.nextLine();
                
        System.out.println("Digite agora sua idade: ");
        Integer idade = leitorNumero.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitorNumero.nextDouble();
        
//        leitor.nextLine();

        System.out.println("Digite a faculdade; ");
        String faculdade = leitorTexto.nextLine();
        
        System.out.println(String.format("Nome digitado: %s\nIdade: %d\nAltura:"
                + "%.2f\n Faculdade: %s", nome, idade, altura, faculdade));
    }
}
