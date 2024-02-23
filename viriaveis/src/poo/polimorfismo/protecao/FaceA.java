package poo.polimorfismo.protecao;

public class FaceA  extends SystemMensseger{
    
    public void enviar() { 
        verificandoSinal();
        System.out.println("Send your Menssenge by FACEBOOK");
    }
    public void receber(){ 
        System.out.println("You have a Menssege");
    }
}
