package ex2;
public class Encomenda {
    
    Double altura, largura, distancia, valorEncomenda,acrescimo;
    String enderecoRemetente, enderecoDestinatario;
    
    
    
    void calcularFrete(){
        if (altura <= 6 && largura <=16){
            acrescimo = 1.01;
        }else if (altura <=15 && largura <=50 ){
            acrescimo = 1.03;
        }else{
            acrescimo = 1.05;
        }
        
        
        if(distancia <= 50){
            valorEncomenda = 3.00;
            valorEncomenda *= acrescimo;
            
        }else if(distancia <= 200){
            valorEncomenda = 5.00;
            valorEncomenda *= acrescimo;
            
        }else {
            valorEncomenda = 7.00;
            valorEncomenda *= acrescimo;
        }
    
        System.out.println(String.format("****Etiqueta de envio**** \n"
                + "Endereço do remetente: \n"
                + "Endereço do destinatário", args));
        
    }
    
    
}
