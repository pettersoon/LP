package ex1;


import java.util.concurrent.ThreadLocalRandom;



public class Bolo {
    
    String sabor;
    Integer escolhaSabor;
    
    Double valor = ThreadLocalRandom.current().nextDouble(30.00, 51.00);
    Integer estoque = 100;
    Integer qtdVendida;
    
   
    
    void comprarBolo (){
        if (qtdVendida < estoque){
            
            estoque-=qtdVendida;
            
        if(escolhaSabor == 1){
            sabor = "Morango";
            exibirRelatorio();
        }else if(escolhaSabor == 2){
            sabor = "Chocolate";
            exibirRelatorio();
        }else if(escolhaSabor == 3){
            sabor = "Abacaxi";
            exibirRelatorio();
        }else if(escolhaSabor < 1 || escolhaSabor >4){
            System.out.println("Sabor invalido digite um número válido");
        }
            
          
        }else{
            System.out.println(String.format("Quantidade insuficiente para atender ao pedido \n"
                    + "Quantidade disponível: %d", estoque));
        }
            
    }
    
    void exibirRelatorio(){
       
            
        
        System.out.println(String.format("O bolo sabor %s foi comprado %d vezes hoje,"
                + "totalizando R$ %.2f", sabor, qtdVendida,(qtdVendida * valor)  ));
        
       
        
        
    }
    
    

        
    
}
