
package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Quisito {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de filhos de 0 a 3 anos: ");
        Double filhosNovos = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de filhos de 4 a 16 anos: ");
        Double filhosMeio = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de filhos de 17 a 18 anos: ");
        Double filhosGrandes = leitor.nextDouble();
        
        Double totalFilhos = (filhosNovos+filhosMeio+filhosGrandes);
        Double valorNovos = filhosNovos * 25.12;
        Double valorMeio = filhosMeio * 15.88;
        Double valorGrandes = filhosGrandes * 12.44;
        Double valorTotal = valorNovos+valorMeio+valorGrandes;
        
        System.out.println(String.format("Você tem um total de %.0f filhos e "
                + "vai receber %.2f de bolsa", 
                totalFilhos, valorTotal));
        
    }
    
}
