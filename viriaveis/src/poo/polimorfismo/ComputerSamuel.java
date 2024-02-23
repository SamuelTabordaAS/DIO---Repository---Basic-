package poo.polimorfismo;

import poo.polimorfismo.protecao.FaceA;
import poo.polimorfismo.protecao.SystemMensseger;
import poo.polimorfismo.protecao.TeleA;

public class ComputerSamuel {
    public static void main(String[] args) {
        SystemMensseger smi = null ; 

        String appEscolhindo = "face";

        if(appEscolhindo.equals("face")){ 
            smi = new FaceA(); 
        }else if (appEscolhindo.equals("tlg")){ 
            smi = new TeleA(); 
        }

        smi.enviar();
        smi.receber();
    }
}
