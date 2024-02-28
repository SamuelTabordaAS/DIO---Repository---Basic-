package desafioBanco;

public class Main {
    public static void main(String[] args) {
        
        Cliente samuel = new Cliente(); 
        samuel.setNome("Samuel");

        ContaCorrente cc = new ContaCorrente(samuel); 
        ContaPoupanca poupanca = new ContaPoupanca(samuel);

        cc.depositar(100);
        poupanca.depositar(20);
        

        cc.extrato(); 
        poupanca.extrato();

        

    }
}
