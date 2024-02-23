package poo.abstracao;

public class TeleA extends SystemMensseger {
    public void enviar() { 
        System.out.println("Send your Menssenge by TELEGRAM");
    }
    public void receber(){ 
        System.out.println("You have a Menssege");
    }
}
