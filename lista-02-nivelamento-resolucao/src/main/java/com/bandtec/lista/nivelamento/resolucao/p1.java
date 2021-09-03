
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class p1 {
    public static void main(String[] args) {
        Integer cadeiras,capacidade,disponibilidade,passo,
                cadeiracliente,contador =0;
        Boolean validador = true;
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem-vindo administrador! Primeiro "
                + "cadastre uma sala do cinema:");
        System.out.println("Quantidade de cadeiras da sala:");
        cadeiras = leitura.nextInt();
        
        System.out.println("Capacidade maxima devido a pandemia: (%)");
        capacidade = leitura.nextInt();
        
        disponibilidade = cadeiras * capacidade / 100 ;
                        
        System.out.println(String.format("A sala possui %d "
                + "ingressos disponiveis", disponibilidade));
        
        
          
        while (validador) {    
            
        System.out.println("Escolha os próximos passos");
        System.out.println(" 1 - reservar cadeira \n 2- sair");
        passo = leitura.nextInt();
        
        switch(passo){
            case 1: 
                System.out.println("Digite a quantidade de cadeiras"
                        + " desejadas");
                
                cadeiracliente = leitura.nextInt();
                
                if(cadeiracliente >0 && cadeiracliente <=disponibilidade){
                
                    for(Integer i =1 ;i <= cadeiracliente;i++){
                       contador++;
                       disponibilidade--;
                        System.out.println(String.format("Venda do: "
                                + "%d° ingresso registrada "
                                + " restam %d ingressos", i,disponibilidade));
                    
                    }
                    
                    System.out.println(String.format("Você comprou"
                            + " %d ingressos bom filme", contador));
                    
                }else{
                
                    System.out.printf("Infelizmente não temos a"
                            + "quantidade de cadeiras digitadas"
                            + "quantidade disponivel: %d Digite uma "
                            + "quantidade válida",disponibilidade);
                }
                
             break;
             
               case 2: 
                    System.out.println("Até logo");
                    validador = false;
             break;
        
             default:
                 System.out.println("Número inválido");
                 break;
         
        }
        
        }
        
    }
}