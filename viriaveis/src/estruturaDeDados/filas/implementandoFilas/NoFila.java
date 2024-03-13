package estruturaDeDados.filas.implementandoFilas;

public class NoFila<T> {

    private T object ; 

    private  NoFila<T> filaRefNo ; 

    public NoFila(){
    }

    public NoFila(T object){ 
        this.filaRefNo = null ; 
        this.object = object ; 
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila getFilaRefNo() {
        return filaRefNo;
    }

    public void setFilaRefNo(NoFila filaRefNo) {
        this.filaRefNo = filaRefNo;
    }

    @Override
    public String toString() {
        return "NoFila [object=" + object + "]";
    }
    
}
