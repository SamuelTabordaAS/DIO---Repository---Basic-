package edu.samuel.estruturaCondicional;

public class CondicionalEncadeadas {
    // nao se limita apenas no IF e no else ! 
    // usamos os ELSE IF como senao se 
    public static void main(String[] args) {
        int nota = 6 ; 
        if(nota >=7 ){ 
            System.out.println("Aprovado ! ");
        }
        else if(nota >= 5 &&  nota < 7 ){ 
            System.out.println("Prova de Recuperacao! ! ");
        }
        else { 
            System.out.println("Reprovado! ");
        }
    }
}

/* CONDICAO TERNARIA (ABREIANDO) 
 * 
 * int nota = 7 ; 
 * 
 * String resultado = nota >= 7 ? "Aprovado" : "Reprovado" ; 
 * 
 * resumimos o if 
 */