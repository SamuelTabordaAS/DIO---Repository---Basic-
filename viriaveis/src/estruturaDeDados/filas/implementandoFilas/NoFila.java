package estruturaDeDados.filas.implementandoFilas;

public class NoFila {

    private Object object ; 

    private  NoFila filaRefNo ; 

    public NoFila(){
    }

    public NoFila(Object object){ 
        this.filaRefNo = null ; 
        this.object = object ; 
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
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
