package edu.samuel.metodos;

public class Cliente {
    public static void main(String[] args ){ 
        SistemaSmartTv smartTv = new SistemaSmartTv() ; 

        System.out.println("TV Ligada ? " + smartTv.power);
        System.out.println( "Qual Canal ?  "+ smartTv.canal);
        System.out.println("Qual o Volume? " + smartTv.volume);

        smartTv.ligar(); 

        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.power);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.power); 

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atualizado para : "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume atualizado para : "+ smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Novo Status -> Canal atualizado: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atualizado: " + smartTv.canal);
    }
}
