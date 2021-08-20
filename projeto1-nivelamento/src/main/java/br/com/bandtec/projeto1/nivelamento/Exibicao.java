
package br.com.bandtec.projeto1.nivelamento;

public class Exibicao {
    
    public static void main(String[] args) {
        
        
        /*
        Atalho para clonar linha:
        shift + ctrl + seta
        */
        
        /*
            Para exibição no console, utilizaremos:
            System.out.println()
        */
        
//        System.out.println("Felipe");
//        System.out.println(12);
//        System.out.println(12 + 42);
//        System.out.println(true);
//        
//        Integer numero = 42;
//        
//        System.out.println(numero);
        
        /*
            Operadores aritméticos básicos:
            
            + -> soma
            - -> subtraçãp
            * -> multiplicação
            / -> divisão
        
            Incremento ou decremento:
            ++
            --
            +=1
            -=1
        */
        
        String nome = "Felipe";
        
        Integer idade = 18;
        
        Double credito = 200.0;
        
//        String frase = "Nome: " + nome + "\n" + " idade: " + idade + "\n" + 
//                " Saldo:" + credito;
//        
//        System.out.println("frase");

            /*
                \n -> possibilita a quebra de linha na exibição
            */
            System.out.println("Nome: " + nome + "\t" + "Idade: " + idade + 
                    "\t" + "Saldo: " + credito);
            
            Double passagens = credito / 4.40;
            
            Integer passagensInteiro = passagens.intValue();
            
            System.out.println("Passagens disponíveis: " + passagensInteiro);
    }
}
