
package br.com.bandtec.projeto1.nivelamento;


public class Tipos {
    
    // torna a classe executável
    // indicação do ponto de partida
    public static void main(String[] args) {
        
        /*
            Não utilizaremos
            Tipos primitivos:
            int
            double
            boolean
        
            Não aceitam "null"
        
            Classes Wrapper:
            Integer
            Double
            Boolean
        
            Aceitam "null"
        */
        
        // String: tipo para texto (alfanuméricos)
        String nome = "Felipe";
        String faculdade = "Bandtec";
        String professorAssistente = "Paulo";
        
        // Integer: utilizaremos para numéricos inteiros
        Integer idadeFelipe = 18;
        Integer idadePaulo = 45;
        Integer numeroDaSorte = 6;
        
        // Double: tipo para números com casas decimais
        Double valor = 10.50;
        Double altura = 1.53;
        
        // Boolean: para representar verdadeiro ou falso
        Boolean ligado = true;
        Boolean temMundial = false;
        Boolean eMaior = idadeFelipe > 30;
        
        System.out.println("TESTE: " + eMaior);
    }
}
