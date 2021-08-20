
package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Chico {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos você passou aquecendo?");
        Integer aquecendo = leitor.nextInt();
        
        System.out.println("Quantos minutos você passou fazendo exercícios "
                + "aeróbicos?");
        Integer aerobicos = leitor.nextInt();
        
        System.out.println("Quantos minutos você passou fazendo musculação?");
        Integer musculacao = leitor.nextInt();
        
        Integer minutoTotal = aquecendo + aerobicos + musculacao;
        Integer caloriaAquecimento = aquecendo * 12;
        Integer caloriaAerobico = aerobicos * 20;
        Integer caloriaMusculacao = musculacao * 25;
        Integer caloriaTotal = caloriaAerobico + caloriaAquecimento + 
                caloriaMusculacao;
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d"
                + " minutos de exercícios e perdeu cerca de %d calorias.", 
                minutoTotal, caloriaTotal));
        
    }
    
}
