package desafioBanco;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato(){ 
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.informacoes();
    }
}
