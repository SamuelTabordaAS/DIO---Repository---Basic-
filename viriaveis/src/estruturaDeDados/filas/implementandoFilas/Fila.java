package estruturaDeDados.filas.implementandoFilas;

public class Fila {
    
    private NoFila refEntradaFila ; 

    public Fila() { 
        this.refEntradaFila = null ; 
    }

    public NoFila first(){ 
        if(!isEmpty()){ 
            NoFila primeiroNo = refEntradaFila ; 
            while(true){ 
                if(primeiroNo.getFilaRefNo() != null){
                    //verifica se a referencia do primeiro NO é nula indicando que é o primeiro
                    primeiroNo = primeiroNo.getFilaRefNo(); 
                    // ele nao sendo o primeiro ele pega a proxima referencia para analisar 
                }
                else{
                    //caso ele ache o primeiro no cortamos o WHILE 
                    break ; 
                }
            }
        }

        return null ; 
    }

    public void enqueue (NoFila novoNo){ 
        novoNo.setFilaRefNo(novoNo);
        this.refEntradaFila = novoNo ; 
    }

    public boolean isEmpty(){ 
        return refEntradaFila == null? true : false; 
    }
}

