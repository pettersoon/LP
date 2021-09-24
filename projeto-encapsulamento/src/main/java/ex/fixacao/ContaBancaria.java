/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.fixacao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    
    private String nomeTitular;
    private Double saldo;
    Integer escolha;
    Double retirada;
    Double entrada;
    String estado;
    
    public ContaBancaria(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    public void realizarOperacao (){
       
        Scanner leitor = new Scanner(System.in);
       
        
        do {          
            System.out.println(String.format("Bem vindo %s, Seu saldo atual é: %.2f \n"
                + "Qual operação será realizada? \n"
                + "Digite 1 para sacar \n"
                + "Digite 2 para depositar \n"
                + "Digite 3 para saber o saldo e estado atual \n"
                + "Digite 4 para sair",
                this.nomeTitular,this.saldo));
            
            
            escolha = leitor.nextInt();
            
            switch (escolha){
                
                
            case 1:
                System.out.println("Qual a quantia a ser sacada?");
                retirada = leitor.nextDouble();
                
                if(retirada > saldo){
                    System.out.println("Saque maior que o limite");
                    System.out.println(String.format("%s, Seu saldo é: %.2f",
                            nomeTitular, saldo));
                }else {
                    sacar();
                    
                    
                }
            break;
            
            case 2:
                System.out.println("Qual a quantia a ser depositada?");
                this.entrada = leitor.nextDouble();
                
                if(this.saldo + entrada <= 200){
                    depositar();
                }else{
                    System.out.println("Deposito maior que o limite");
                    System.out.println(String.format("%s, Seu saldo é: %.2f",
                            this.nomeTitular, this.saldo));
                    
                }
            break;
            
            case 3:
                 if(saldo<50){
                    estado = "Ruim";
                 }else if(saldo<101){
                    estado = "Regular";
                 }else{
                    estado = "Bom";
                 }
                System.out.println(String.format("%s, Seu saldo é: %.2f e o estado é %s",
                            nomeTitular, saldo, estado));
                
            break; 
            
            case 4:
                System.out.println("Até logo");
            break;
            
            default:
                System.out.println("Operação invalida!");
            break;    
                
        }
        } while (!escolha.equals(4));
        
    }
   
    public void sacar (){
        saldo -= retirada;
        
        if(saldo<50){
           estado = "Ruim";
        }else if(saldo<101){
            estado = "Regular";
        }else{
            estado = "Bom";
        }
        
        System.out.println(String.format("Seu saldo atual é: %.2f", saldo));
        System.out.println("Situação atual da conta:"+ estado);
        
    }
    public void depositar (){
        saldo += entrada ;
        
        if(saldo<50){
            estado = "Ruim";
        }else if(saldo<101){
            estado = "Regular";
        }else{
            estado = "Bom";
        }
        
        System.out.println(String.format("Seu saldo atual é: %.2f", saldo));
        System.out.println("Situação atual da conta:"+ estado  );
    }
}
