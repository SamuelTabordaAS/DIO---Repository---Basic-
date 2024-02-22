package poo.encapsulamento;

public class ComputadorSamuel {
    public static void main(String[] args) {
         MSNMenssenger msn = new MSNMenssenger() ;

        /*  msn.enviarMensagem();
         msn.verificandoIternet();
         msn.salvarMensagem();
         */ 

         // desta forma funciona porem nao é seguro o usuario ter que verificar isso 
         // nao fica usavel desta maneira entao vamos mudar ! 
         msn.enviarMensagem();
    }
}
