package estruturaDeDados.filas.implementandoFilas;

public class MainFila {

    public static void main(String[] args) {
        
        Fila<String> minhaFila = new Fila<>() ; 

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Teste");

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
    
}
