package poo.encapsulamento;

public class MSNMenssenger {
    
    public void enviarMensagem(){ 
        verificandoIternet();
        System.out.println("Mesangem carregada!");
        salvarMensagem();
        // desta forma o metodo de enviarMensagem fica respontavel pelas acoes e escode isso do usuario. 
    }

    public void receberMensagem(){ 
        System.out.println("Recebendo uma mesangem");
    }
    // os metodos de verificar e salvar nao precisa ser visto pelo USER SAMUEL 
    // entao vamos seguir com o modo de encapsulamento para eles. 

    private void verificandoIternet(){ 
        System.out.println("Internet OK !");
    }

    private void salvarMensagem(){ 
        System.out.println("Mesangem salva ! ");
    }
}
