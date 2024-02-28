package desafioBanco;

public class Conta {

    private static final int AGENCIA_PADRAO = 0 ; 
    private static int SEQUENCIAL = 1 ; 
    private int agencia ; 
    private int numero; 
    private double saldo; 
    protected Cliente cliente ; 

    public Conta(Cliente cliente){ 
        this.agencia = AGENCIA_PADRAO ; 
        this.numero = SEQUENCIAL++ ; 
        this.cliente = cliente ;
    }

    public void sacar(double valor){ 
        saldo-= valor ; 
    }
    public void depositar(double valor){ 
        saldo+= valor ; 
    }
    public void transferir(double valor, Conta contaDestino){ 
        this.sacar(valor); 
        contaDestino.depositar(valor);
    }

    public int getAgencia(){ 
        return agencia ; 
    }
    public int getNumero(){ 
        return numero ; 
    }
    public double getSaldo(){ 
        return saldo ; 
    }
    protected void informacoes(){ 
        System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("NUMERO: %d", this.numero));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }

  
}
