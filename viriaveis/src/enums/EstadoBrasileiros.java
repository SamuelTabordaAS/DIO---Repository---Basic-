package enums;

public enum EstadoBrasileiros {

    SAO_PAULO("SP", "SAO PAULO"),
    RIO_DE_JANEIRO("RJ", "RIO DE JANEIRO"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA" , "Maranhao");
    
    private String nome;
    private String sigla; 

    private EstadoBrasileiros(String sigla, String nome){
        this.sigla = sigla ; 
        this.nome = nome ; 
    }

    public String getNome() { 
        return nome; 
    }
    public String getSigla(){ 
        return sigla ; 
    }

    public String getNomeMaiuscula(){ 
        return nome.toUpperCase();
    }
}
