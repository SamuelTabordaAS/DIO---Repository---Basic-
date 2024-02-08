package construtor;

public class SistemaDeCadastro {
    
    public static void main(String[] args) {
        
        Pessoa samuel = new Pessoa("Samuel", "123");
        // Quando usamos o metodo construtor devemos colocar direto na instacia do Objeto os valores definidos 


        samuel.setEndereco("Mora logo ali ! ");

        System.out.println(samuel.getNome()+ " - "+ samuel.getCpf()+ " - "+ samuel.getEndereco());
    }
}
