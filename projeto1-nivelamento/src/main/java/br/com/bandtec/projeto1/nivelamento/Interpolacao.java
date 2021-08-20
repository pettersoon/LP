
package br.com.bandtec.projeto1.nivelamento;

public class Interpolacao {

    public static void main(String[] args) {
        
        String nome = "Felipe";
        Integer idade = 18;
        Double altura = 1.78;
        Boolean aluno = true;
        
        /*
            Interpolação de texto Java
        
            String.format(texto, args);
        
        
        */
        
//        String alunoLabel;
        
//        if (aluno) {
//            alunoLabel = "SIM";
//        } else {
//            alunoLabel = "NÃO";
//        }
        
        String info = String.format("Nome: %s idade %d altura: %.2f Aluno: %s", 
                nome, idade, altura, (aluno ? "Sim" : "Não"));
        
        System.out.println(info);
    }
    
}
