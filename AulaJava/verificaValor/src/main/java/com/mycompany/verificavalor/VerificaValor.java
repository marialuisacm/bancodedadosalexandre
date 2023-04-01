package com.mycompany.verificavalor;

public class VerificaValor {

    public static void main(String[] args) {
       int valor;
       valor = 15;
       
     if(valor>= 1 && <= 9){
           System.out.println("Valor está na faixa permitida");
       }
       else{
         System.out.println("Valor fora da faixa permitida");
        
       }
    }
}
