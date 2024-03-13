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
            return primeiroNo;
        }

        return null ; 
    }

    public NoFila dequeue(){ 
        if(!isEmpty()){ 
            NoFila primeiroNo = refEntradaFila ; 
            NoFila auxilar = refEntradaFila;
            while(true){ 
                if(primeiroNo.getFilaRefNo() != null){
                    //verifica se a referencia do primeiro NO é nula indicando que é o primeiro
                    auxilar = primeiroNo ; 
                    
                    primeiroNo = primeiroNo.getFilaRefNo(); 
                    // ele nao sendo o primeiro ele pega a proxima referencia para analisar 
                }
                else{
                    auxilar.setFilaRefNo(null);
                    // setamos a REF do novo primeiro no para indicar que ele é o primeiro NO 
                    //caso ele ache o primeiro no cortamos o WHILE 
                    break ; 
                }
            }
            return primeiroNo ; 
        }

        return null ; 
    }

    public void enqueue (NoFila novoNo){ 
        novoNo.setFilaRefNo(refEntradaFila);
        this.refEntradaFila = novoNo ; 
    }

    public boolean isEmpty(){ 
        return refEntradaFila == null? true : false; 
    }

    @Override
    public String toString() {
        String stringRetorno = " "; 
        NoFila noAuxiliar = refEntradaFila ; 

        if(refEntradaFila != null){ 
            while(true){ 
                stringRetorno += "[No{Objeto= "+ noAuxiliar.getObject()+ "}]----->";
                if(noAuxiliar.getFilaRefNo() != null){ 
                    noAuxiliar = noAuxiliar.getFilaRefNo(); 
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else { 
            stringRetorno = "null"; 
        }

        return stringRetorno ; 
    }
}

