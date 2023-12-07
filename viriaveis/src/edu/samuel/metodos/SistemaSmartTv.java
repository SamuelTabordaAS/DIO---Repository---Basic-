package edu.samuel.metodos;

public class SistemaSmartTv {
    
    boolean power = false ; 
    int canal = 1; 
    int volume = 35 ; 

    public void ligar() { 
        power = true ; 
    }

    public void desligar() { 
        power = false ; 
    }

    public void aumentarVolume() { 
        volume ++ ; 
        System.out.println("Aumentando volume para : " + volume );
    }
    public void diminuirVolume() { 
        volume -- ; 
        System.out.println("Diminuindo volume para : " + volume );
    }

    public void subirCanal(){ 
        canal ++ ; 
        System.out.println("Canal alterado para: " + canal );
    }

    public void diminuirCanal(){ 
        canal -- ; 
        System.out.println("Canal alterado para: " + canal );
    }
}
