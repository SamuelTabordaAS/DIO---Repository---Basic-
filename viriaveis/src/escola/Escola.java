package escola;
// usando get e set entre classes  
public class Escola {
    public static void main(String[] args) {
        Aluno samuel = new Aluno(); 

        samuel.setNome("Samuel");
        samuel.setIdade(21);
        System.out.println("O Aluno "+ samuel.getNome() + " tem " + samuel.getIdade() + " anos");
    }
}
