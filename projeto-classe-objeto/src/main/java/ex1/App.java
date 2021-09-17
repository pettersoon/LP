package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Bolo pedido = new Bolo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o bolo desejado?");
        
        pedido.escolhaSabor = leitor.nextInt();
        
        System.out.println("Qual a quantia desejada?");
        
        pedido.qtdVendida = leitor.nextInt();
        
        
        pedido.comprarBolo();
        
        
    }
}
