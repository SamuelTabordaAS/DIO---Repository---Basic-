package enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        
        for(EstadoBrasileiros e: EstadoBrasileiros.values()){ 
            System.out.println(e.getSigla()+ " - "+ e.getNome());
        }
        // percorrendo todos meu ENUM dentro da minha classe 

         // pegando um ENUM especifico 
        EstadoBrasileiros eb = EstadoBrasileiros.SAO_PAULO; 

        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiuscula());
        System.out.println(eb.getSigla());
    }

   
}
