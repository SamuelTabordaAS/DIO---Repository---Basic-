package poo.polimorfismo.protecao;

public class TeleA extends SystemMensseger {
    public void enviar() { 
        verificandoSinal();
        System.out.println("Send your Menssenge by TELEGRAM");
    }
    public void receber(){ 
        System.out.println("You have a Menssege");
    }
}
