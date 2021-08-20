package br.com.bandtec.projeto2.nivelamento;

public class Numericos {
    
    public static void main(String[] args) {
        
        Double numero = 3.4;
        
        // Math.ceil() arredonda para cima
        System.out.println("Arredondando para cima: " + Math.ceil(numero));
        
        // Math.floor() arredonda para baixo
        System.out.println("Arredondando para baixo: " + Math.floor(numero));
        
        // Round retorna numero do tipo Long
        System.out.println("\nRound: " + Math.round(numero));
        
        //Retorna o maior (MAX_VALUE) valor inteiro e o menor (MIN_VALUE)
        System.out.println("\nInteirão: " + Integer.MAX_VALUE);
        System.out.println("Inteirinho: " + Integer.MIN_VALUE);

        System.out.println("\nDoublezão: " + Double.MAX_VALUE);
        System.out.println("Doublezinho: " + Double.MIN_VALUE);
        
        System.out.println("\nLongzão: " + Long.MAX_VALUE);
        System.out.println("Longuinho: " + Long.MIN_VALUE);
    }
}
