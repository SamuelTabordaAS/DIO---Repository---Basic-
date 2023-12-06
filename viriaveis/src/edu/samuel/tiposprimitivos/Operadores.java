package edu.samuel.tiposprimitivos;

public class Operadores {
    public static void main(String[] args){
        /* tipos de operadores aritmeticos 
         = Atribuicao 
         + soma // QUANDO USADO EM VARIAVEL TIPO STRING ELE EXECUTA A CONCATENACAO 
         - subtracao 
         * multiplicacao 
         / divisao 
         % modulo 
         ++ incremento 
         -- decremento 
         == igual 
         != diferente 
         < menor 
         > maior 
         && and 
         || or 
        */
        // transformando um numero positivo para negativo 
            int numero = 5 ; 
            
            numero = - numero ; 
        // para transformalo em positivo novamento precisamos multiplicar 
            numero = numero * -1 ; 
        // assim volta a ser positivo, nao usamos + pois é um operador 

        // Operador Ternario  ? 

        int a, b ; 

        a = 5 ; 
        b = 6 ; 

        String resultado = a==b ? "verdadeiro": "falso"; 

        System.out.println(resultado); 
    }
}
