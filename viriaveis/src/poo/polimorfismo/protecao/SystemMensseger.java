package poo.polimorfismo.protecao;

public abstract class SystemMensseger {
    
    public abstract void enviar(); 
    public abstract void receber(); 

    protected void verificandoSinal(){ 
        System.out.println("Verificando sinal");
    }
}
