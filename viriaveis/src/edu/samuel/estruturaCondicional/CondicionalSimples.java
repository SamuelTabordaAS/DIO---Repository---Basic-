package edu.samuel.estruturaCondicional;

public class CondicionalSimples {
    // ocorre validacao ou execucao apenas quando a condicao for posivitiva 
    public static void main(String[] args) {
         double saldo = 25.0 ; 
         double valorSolicitado = 17.0 ; 

         if(valorSolicitado < saldo){ 
            saldo = saldo - valorSolicitado ; 
         }
         System.out.println(saldo);
    }
}
